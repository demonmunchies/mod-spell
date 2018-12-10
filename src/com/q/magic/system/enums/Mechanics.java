package com.q.magic.system.enums;

public enum Mechanics
{

	// Combat is a huge part of any MMO, so damage-based spells
	// Evocation / Conjuration (damage) spells
	DAMAGE_INSTANT, DAMAGE_OVER_TIME,

	// Combat is also about disabling the enemy and buffing allies
	// Transmutation spells (combat)
	MODIFY_ATTRIBUTE, MODIFY_RESISTANCE, MODIFY_SKILL, APPLY_STATUS_CONDITION, GRANT_ABILITY,

	// Anti-magic is also useful in combat
	// Abjuration spells
	REMOVE_TYPE, NEGATE_TYPE, PREVENT_TYPE, PREVENT_PASSAGE, ABSORB_DAMAGE, WARD_AREA, WARD_ENTITY,

	// But there is a lot that is non-combat focused
	// Divination spells
	ANALYZE_ENTITY, LOCATE_ENTITY, OBSCURE_ENTITY, REMOTE_VIEW, DETECT_TYPE, BEACON_LOCATION, BEACON_TARGET,

	// Transmutation (non-combat)
	TRANSMUTE_MATERIAL,

	// Conjuration (non-damage)
	TELEPORT_DASH, TELEPORT_LOCATION, SUMMON_ENTITY,

	// Spell Effects of personal interest
	// Time-based
	FLASH_FORWARD, FLASH_BACKWARD,

}
