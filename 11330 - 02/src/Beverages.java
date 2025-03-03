public abstract class Beverages {
    private boolean wantsExtras;

    // Template method
    public final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras) {
            addExtras();
        }
    }

    public void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }

    // Common methods
    public void boilWater() {
        System.out.println("Boiling water...");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void brew();
    public abstract void addCondiments();
    public abstract void addExtras();
}