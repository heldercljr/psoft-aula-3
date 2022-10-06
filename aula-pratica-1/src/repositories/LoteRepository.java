package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Lote;

public class LoteRepository {

	private List<Lote> lotes;

	public LoteRepository() {
		this.lotes = new ArrayList<Lote>();
	}

	public boolean addLote(Lote lote) {
		boolean result = false;

		if (!this.lotes.contains(lote))
			result = this.lotes.add(lote);

		return result;
	}

	public boolean removeLote(Lote lote) {
		boolean result = false;

		if (this.lotes.contains(lote))
			result = this.lotes.remove(lote);
		
		return result;
	}

	public Lote[] listLotes() {
		return (Lote[]) this.lotes.toArray();
	}
}
