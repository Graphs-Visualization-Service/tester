package gvs.model.graph;

import gvs.graph.GVSDefaultVertex;
import gvs.graph.GVSDirectedEdge;
import gvs.styles.GVSStyle;

public class TestDirectedEdge implements GVSDirectedEdge {
  private GVSDefaultVertex startVertex;
  private GVSDefaultVertex endVertex;
  private String label;
  private GVSStyle style;

  public TestDirectedEdge(GVSDefaultVertex startVertex,
      GVSDefaultVertex endVertex, String label, GVSStyle style) {
    this.startVertex = startVertex;
    this.endVertex = endVertex;
    this.label = label;
    this.style = style;
  }

  public TestDirectedEdge(GVSDefaultVertex startVertex,
      GVSDefaultVertex endVertex, String label) {
    this(startVertex, endVertex, label, null);
  }

  @Override
  public GVSDefaultVertex getGVSStartVertex() {
    return startVertex;
  }

  @Override
  public GVSDefaultVertex getGVSEndVertex() {
    return endVertex;
  }

  @Override
  public String getGVSEdgeLabel() {
    return label;
  }

  @Override
  public GVSStyle getStyle() {
    return style;
  }

}