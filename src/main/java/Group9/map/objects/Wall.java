package Group9.map.objects;

import Group9.tree.PointContainer;
import Interop.Percept.Vision.ObjectPerceptType;

public class Wall extends MapObject {

    public Wall(PointContainer.Quadrilateral area) {
        super(area, ObjectPerceptType.Wall);
    }

}
