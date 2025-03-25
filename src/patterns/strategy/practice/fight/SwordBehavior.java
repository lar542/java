package patterns.strategy.practice.fight;

// '무기사용' 행동 구현체, 어떻게 사용 하는가?
public class SwordBehavior implements WeaponBehavior {

    @Override
    public String useWeapon() {
        return "검 휘두르기!";
    }
}
