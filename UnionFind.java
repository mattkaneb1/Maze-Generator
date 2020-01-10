public class UnionFind{
	public LLAddOnly makeset(Cell c){
		LLAddOnly set = new LLAddOnly();
		set.add(c);
		return set;
	}

	public LLAddOnly find(Cell c){
		return c.head;
	}

	public void union(Cell a,Cell b){
		LLAddOnly hA=a.head;
		LLAddOnly hB=b.head;
		Cell c;
		while (hB.first!=null){
			c=hB.first;
			hB.first=c.next;
			hA.add(c);
		}
	}
}