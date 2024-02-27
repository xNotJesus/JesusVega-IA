package TareaArbol;

public class Nodo {

	private String name;
    private Nodo left, right;

    public Nodo(String name) {
        this.name = name;
        left = null;
        right = null;
    }
	
    public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public Nodo getleft() {
		return left;
	}

	public void setleft(Nodo left) {
		this.left = left;
	}

	public Nodo getright() {
		return right;
	}

	public void setright(Nodo right) {
		this.right = right;
	}
	
	@Override
	public String toString() {
		return "[ Nodo "+ name +" ]";
	}
	
}

