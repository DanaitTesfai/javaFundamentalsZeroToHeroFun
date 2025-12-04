package org.java_fundamentals._09_composition._06_computerAndComponents;

public class GraphicsCard {
    private String graphicsCardInfo;

    public GraphicsCard(String graphicsCardInfo) {
        this.graphicsCardInfo = graphicsCardInfo;
    }

    public void showGraphicsCardInfo(){
        System.out.println("Graphics Card: " + graphicsCardInfo);
    }
}
