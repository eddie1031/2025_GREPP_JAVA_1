package grepp.lec.part5.objects.inner.mat;

import java.util.Comparator;

public class CharacterLevelComparator implements Comparator<Character> {
    @Override
    public int compare(Character o1, Character o2) {
        return Integer.compare(o1.level, o2.level); // 오름차순
    }
}
