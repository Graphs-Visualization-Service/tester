package gvs;

import java.util.Vector;

import gvs.graph.GVSDefaultVertex;
import gvs.graph.GVSGraph;
import gvs.typ.GVSDefaultTyp.LineColor;
import gvs.typ.GVSDefaultTyp.LineStyle;
import gvs.typ.GVSDefaultTyp.LineThickness;
import gvs.typ.edge.GVSEdgeTyp;
import gvs.typ.graph.GVSGraphTyp;
import gvs.typ.graph.GVSGraphTyp.Background;
import gvs.typ.vertex.GVSEllipseVertexTyp;
import gvs.typ.vertex.GVSEllipseVertexTyp.FillColor;

public class TestRealtivGraph {

  GVSEdgeTyp unexploredEdge;
  GVSEdgeTyp discoveredEdge;

  GVSEllipseVertexTyp unexploredVertex;
  GVSEllipseVertexTyp visitedVertex;
  GVSGraph g;
  Vector<MyDirectedEdge> edges = new Vector<MyDirectedEdge>();
  Vector<MyDefaultVertex> nodes = new Vector<MyDefaultVertex>();

  public TestRealtivGraph() {

    unexploredEdge = new GVSEdgeTyp(LineColor.black, LineStyle.dotted,
        LineThickness.standard);

    discoveredEdge = new GVSEdgeTyp(LineColor.red, LineStyle.dotted,
        LineThickness.bold);

    unexploredVertex = new GVSEllipseVertexTyp(LineColor.red,
        LineStyle.standard, LineThickness.bold, FillColor.standard);

    visitedVertex = new GVSEllipseVertexTyp(LineColor.red, LineStyle.dashed,
        LineThickness.standard, FillColor.blue);

  }

  public static void main(String[] args) {
    // Logger.getInstance().setAllLoggerLevels(DEBUG);
    TestRealtivGraph gr = new TestRealtivGraph();
    gr.relativGraph();
  }

  public void relativGraph() {
    MyRelativVertex rv1 = new MyRelativVertex("", unexploredVertex, 50, 50);
    MyRelativVertex rv2 = new MyRelativVertex("", unexploredVertex, 20, 10);
    MyRelativVertex rv3 = new MyRelativVertex("", unexploredVertex, 31, 64);
    MyRelativVertex rv4 = new MyRelativVertex("", unexploredVertex, 85, 75);

    MyRelativVertex rv5 = new MyRelativVertex("", unexploredVertex, 60, 40);
    MyRelativVertex rv6 = new MyRelativVertex("", unexploredVertex, 12, 45);
    MyRelativVertex rv7 = new MyRelativVertex("", unexploredVertex, 90, 20);
    MyRelativVertex rv8 = new MyRelativVertex("", unexploredVertex, 22, 28);

    MyUndirectedEdge ue1 = new MyUndirectedEdge("", unexploredEdge,
        new GVSDefaultVertex[] { rv1, rv2 });
    MyUndirectedEdge ue2 = new MyUndirectedEdge("", unexploredEdge,
        new GVSDefaultVertex[] { rv1, rv3 });
    MyUndirectedEdge ue3 = new MyUndirectedEdge("", unexploredEdge,
        new GVSDefaultVertex[] { rv1, rv4 });
    MyUndirectedEdge ue4 = new MyUndirectedEdge("", unexploredEdge,
        new GVSDefaultVertex[] { rv3, rv4 });
    MyUndirectedEdge ue5 = new MyUndirectedEdge("", unexploredEdge,
        new GVSDefaultVertex[] { rv5, rv6 });
    MyUndirectedEdge ue6 = new MyUndirectedEdge("", unexploredEdge,
        new GVSDefaultVertex[] { rv5, rv7 });
    MyUndirectedEdge ue7 = new MyUndirectedEdge("", unexploredEdge,
        new GVSDefaultVertex[] { rv7, rv8 });
    MyUndirectedEdge ue8 = new MyUndirectedEdge("", unexploredEdge,
        new GVSDefaultVertex[] { rv3, rv8 });

    g = new GVSGraph("Map", new GVSGraphTyp(Background.standard));
    g.setMaxLabelLength(3);

    g.add(rv1);
    g.add(rv2);
    g.add(rv3);
    g.add(rv4);
    g.display();
    g.add(rv5);
    g.add(rv6);
    g.add(rv7);
    g.add(rv8);
    g.display();

    g.add(ue1);
    g.add(ue2);
    g.add(ue3);
    g.add(ue4);

    g.display();
    g.add(ue5);
    g.add(ue6);
    g.add(ue7);
    g.add(ue8);

    g.display();

    ue1.setArrow(1);
    ue2.setArrow(1);
    ue3.setArrow(1);
    ue4.setArrow(2);
    ue5.setArrow(1);
    ue6.setArrow(1);
    ue7.setArrow(1);
    ue8.setArrow(1);
    g.display();
    g.disconnect();

  }

}