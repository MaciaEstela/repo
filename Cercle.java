public class Cercle {
 private float x;
 private float y;

    public Cercle(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Cercle() {
    }

    @Override
    public String toString() {
        return "Cercle{" + "x=" + x + ", y=" + y + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cercle other = (Cercle) obj;
        if (Float.floatToIntBits(this.x) != Float.floatToIntBits(other.x)) {
            return false;
        }
        if (Float.floatToIntBits(this.y) != Float.floatToIntBits(other.y)) {
            return false;
        }
        return true;
    }
 
   
 
}
