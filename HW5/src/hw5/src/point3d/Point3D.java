package hw5.src.point3d;

public class Point3D extends Point2D {
	   
	   private int z;

	   public Point3D() {  
	      super();     
	      this.z = 0;
	   }
	  
	   public Point3D(int x, int y, int z) {
	      super(x, y);
	      this.z = z;
	   }

	   public int getZ() {
	      return this.z;
	   }
	   
	   public void setZ(int z) {
	      this.z = z;
	   }
	   
	   public void setXYZ(int x, int y, int z) {
		   	super.setXY(x, y);			
			this.z = z;
		}
	   
		public int[] getXYZ() {
			int[] results = new int[3];
			results[0] = getX();
			results[1] = getY();
			results[2] = this.z;
			return results;
		}
		
	   @Override
	   public String toString() {
	      return "(" + getX() + "," + getY() + "," + getZ()+ ")";
	   }
	}