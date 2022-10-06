package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Lote;

public class LoteRepository {

	private List<Lote> lotes;

	public LoteRepository() {
		this.lotes = new ArrayList<Lote>();
	}

	public boolean salvarLote(Lote lote) {
		boolean result = false;

		if (!this.lotes.contains(lote))
			result = this.lotes.add(lote);

		return result;
	}

	public boolean removerLote(Lote lote) {
		boolean result = false;

		if (this.lotes.contains(lote))
			result = this.lotes.remove(lote);
		
		return result;
	}

	public Lote[] listarLotes() {
		return (Lote[]) this.lotes.toArray();
	}
}
