import java.text.DecimalFormat;

public class CommunityDetection {
    public static void main(String [] args){

    /*    Equation:-
                PartA = ClusterNeighborConnectionCount / totalEdgeCount
                PartB = ClusterEdgeToVerticesConnectionCount / Square(2*totalEdgeCount) */


        DecimalFormat f = new DecimalFormat("##.00");

        //Inputs
        double totalEdgeCount = 11.0;

        //Inputs of Cluster V1
        double v1_ClusterNeighborConnectionCount = 3.0;
        double v1_ClusterEdgeToVerticesConnectionCount = 11.0;

        //Inputs of Cluster V2
        double v2_ClusterNeighborConnectionCount = 3.0;
        double v2_ClusterEdgeToVerticesConnectionCount = 11.0;


        //PartA of Cluster V1
        double v1_partA = Double.parseDouble(f.format(v1_ClusterNeighborConnectionCount/totalEdgeCount));
        System.out.println("v1_partA :\n" + v1_partA);

        //PartB of Cluster V1
        Double v1_partB = Double.valueOf(f.format(Math.pow(v1_ClusterEdgeToVerticesConnectionCount,2)/(Math.pow((2*totalEdgeCount),2))));
        System.out.println("v1_partB :\n" + v1_partB);

        //PartA of Cluster V2
        double v2_partA = Double.parseDouble(f.format(v2_ClusterNeighborConnectionCount/totalEdgeCount));
        System.out.println("v2_partA :\n" + v2_partA);

        //PartB of Cluster V2
        double v2_partB = Double.valueOf(f.format(Math.pow(v2_ClusterEdgeToVerticesConnectionCount,2)/(Math.pow((2*totalEdgeCount),2))));
        System.out.println("v2_partB :\n" + v2_partB);

        //Modularity Output
        double modularity = Double.valueOf(f.format(((v1_partA - v1_partB) + (v2_partA - v2_partB))));
        System.out.println("Modularity  Output:\n" + modularity);

    }
}
