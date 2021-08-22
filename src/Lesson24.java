public class Lesson24 {
    public static void main(String[] args) {

        //Lesson 24 practice - GRAPHS
        //EXAMPLE FROM baeldung
        Graph myGraph = new Graph();
        myGraph = createGraph();

        //Print out all elements of the Graph
        for (Vertex myVertex : myGraph.getAdjVertices().keySet()) {
            System.out.println(myVertex.label);
        }
        System.out.println();


        //EXAMPLE FROM MOODLE (FLIGHTS)
        //Create a new Graph based on the copied code. The new Graph is related to the network of airports in South Africa

        Graph flightGraph = new Graph();
        flightGraph = createAirportsGraph();

        //Print out all elements of the new Graph
        for (Vertex myVertex : flightGraph.getAdjVertices().keySet()) {
            System.out.println(myVertex.label);
        }
        System.out.println();


        //Write an algorithm that calculates how many direct flights are in the Graph (in total).
        int directFlights = 0;
        for (Vertex myVertex : flightGraph.getAdjVertices().keySet()) {
            for (Vertex flight : flightGraph.getAdjVertices(myVertex.label)) {
                directFlights++;
            }
        }
        System.out.println("Total number of direct flights: " + directFlights);
        System.out.println();


        //Print out all airports which are connected to “Cape Town” airport with direct flight.
        System.out.println("Direct flights from \"Cape Town\": ");
        for (Vertex directFlightCT : flightGraph.getAdjVertices("Cape Town")) {
            System.out.println(directFlightCT.label);
        }
        System.out.println();


        //Write an algorithm that calculates how many direct flights are from Jo’burg airport.

        int directFlightsJB = 0;
        for (Vertex directFlightJB : flightGraph.getAdjVertices("Jo'burg")) {
            directFlightsJB++;
        }
        System.out.println("Number of direct flights from \"Jo'burg\": " + directFlightsJB);
        System.out.println();










    }

    static Graph createGraph() {
        Graph graph = new Graph();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
        return graph;
    }

    static Graph createAirportsGraph() {
        Graph graph = new Graph();
        graph.addVertex("Jo'burg");
        graph.addVertex("Durbs");
        graph.addVertex("Livingstone");
        graph.addVertex("Harare");
        graph.addVertex("Mauritius");
        graph.addVertex("Windhoek");
        graph.addVertex("Victoria Falls");
        graph.addVertex("East London");
        graph.addVertex("Cape Town");
        graph.addVertex("PE");
        graph.addEdge("Jo'burg", "Durbs");
        graph.addEdge("Jo'burg", "Livingstone");
        graph.addEdge("Jo'burg", "Harare");
        graph.addEdge("Jo'burg", "Mauritius");
        graph.addEdge("Jo'burg", "Windhoek");
        graph.addEdge("Jo'burg", "Victoria Falls");
        graph.addEdge("Jo'burg", "East London");
        graph.addEdge("Jo'burg", "Cape Town");
        graph.addEdge("Jo'burg", "PE");
        graph.addEdge("Durbs", "Cape Town");
        graph.addEdge("Durbs", "PE");
        graph.addEdge("East London", "Cape Town");
        graph.addEdge("PE", "Cape Town");
        return graph;


    }
}

