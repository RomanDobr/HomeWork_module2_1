package homework.homework4.ex3;

import java.util.Objects;

public class SkyTower {
    private String name;
    private int height;

    public SkyTower(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SkyTower skyTower = (SkyTower) o;
        return name.equals(skyTower.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "SkyTower{"
                + "name='" + name + '\''
                + ", height=" + height
                + '}';
    }
}
