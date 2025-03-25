package patterns.strategy.practice.character;

import patterns.strategy.practice.fight.WeaponBehavior;

// 수퍼 클래스 캐릭터
public abstract class Character {

    WeaponBehavior weapon;

    // 무기로 공격하다
    public String fight() {
        return this.weapon.useWeapon();
    }

    // 무기 체인지
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
