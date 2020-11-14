class NBody{
    public static double readRadius(String filePath){
        In in=new In(filePath);
        in.readInt();
        double radius=in.readDouble();
        return radius;
    }
    public static Planet[] ReadPlanets(String filePath){

        In in=new In(filePath);
        int numPlanets=in.readInt();
        in.readDouble();
        //如何创建一个引用类型的数组,但是由于数组长度一定，而这次作业的planet个数未知，因此要用list相关的知识
        //Planet[] allPlanets=new Planet[numPlanets];

    }
    public static void main(String[] args) {
        System.out.println(readRadius("./data/planets.txt"));
    }
}