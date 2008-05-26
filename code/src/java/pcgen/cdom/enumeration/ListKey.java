/*
 * Copyright 2005 (C) Tom Parker <thpr@sourceforge.net>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 * Created on June 18, 2005.
 *
 * Current Ver: $Revision$
 * Last Editor: $Author$
 * Last Edited: $Date$
 */
package pcgen.cdom.enumeration;

import java.net.URI;

import pcgen.base.formula.Formula;
import pcgen.cdom.base.CDOMReference;
import pcgen.cdom.content.LevelCommandFactory;
import pcgen.cdom.list.ClassSkillList;
import pcgen.cdom.modifier.ChangeArmorType;
import pcgen.cdom.reference.CDOMSingleRef;
import pcgen.core.Ability;
import pcgen.core.Domain;
import pcgen.core.Equipment;
import pcgen.core.EquipmentModifier;
import pcgen.core.Language;
import pcgen.core.QualifiedObject;
import pcgen.core.SpecialAbility;
import pcgen.core.SpecialProperty;
import pcgen.core.WeaponProf;
import pcgen.core.bonus.BonusObj;
import pcgen.persistence.lst.CampaignSourceEntry;

/**
 * @author Tom Parker <thpr@sourceforge.net>
 *
 * This is a Typesafe enumeration of legal List Characteristics of an object.
 */
public final class ListKey<T> {

	/** AUTO_LANGUAGES - a ListKey */
	public static final ListKey<Language> AUTO_LANGUAGES = new ListKey<Language>();
	/** CLASS_SKILLS - a ListKey */
	public static final ListKey<String> CLASS_SKILLS = new ListKey<String>();
	/** CROSS_CLASS_SKILLS - a ListKey */
	public static final ListKey<String> CROSS_CLASS_SKILLS = new ListKey<String>();
	/** FILE_ABILITY_CATEGORY - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_ABILITY_CATEGORY = new ListKey<CampaignSourceEntry>();
	/** FILE_BIO_SET - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_BIO_SET = new ListKey<CampaignSourceEntry>();
	/** FILE_CLASS - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_CLASS = new ListKey<CampaignSourceEntry>();
	/** FILE_CLASS_SKILL - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_CLASS_SKILL = new ListKey<CampaignSourceEntry>();
	/** FILE_CLASS_SPELL - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_CLASS_SPELL = new ListKey<CampaignSourceEntry>();
	/** FILE_COMPANION_MOD - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_COMPANION_MOD = new ListKey<CampaignSourceEntry>();
	/** FILE_COVER - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_COVER = new ListKey<CampaignSourceEntry>();
	/** FILE_DEITY - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_DEITY = new ListKey<CampaignSourceEntry>();
	/** FILE_DOMAIN - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_DOMAIN = new ListKey<CampaignSourceEntry>();
	/** FILE_EQUIP - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_EQUIP = new ListKey<CampaignSourceEntry>();
	/** FILE_EQUIP_MOD - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_EQUIP_MOD = new ListKey<CampaignSourceEntry>();
	/** FILE_ABILITY - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_ABILITY = new ListKey<CampaignSourceEntry>();
	/** FILE_FEAT - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_FEAT = new ListKey<CampaignSourceEntry>();
	/** FILE_KIT - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_KIT = new ListKey<CampaignSourceEntry>();
	/** FILE_LANGUAGE - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_LANGUAGE = new ListKey<CampaignSourceEntry>();
	/** FILE_LST_EXCLUDE - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_LST_EXCLUDE = new ListKey<CampaignSourceEntry>();
	/** FILE_PCC - a ListKey */
	public static final ListKey<URI> FILE_PCC = new ListKey<URI>();
	/** FILE_RACE - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_RACE = new ListKey<CampaignSourceEntry>();
	/** FILE_REQ_SKILL - a ListKey */
	public static final ListKey<String> FILE_REQ_SKILL = new ListKey<String>();
	/** FILE_SKILL - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_SKILL = new ListKey<CampaignSourceEntry>();
	/** FILE_SPELL - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_SPELL = new ListKey<CampaignSourceEntry>();
	/** FILE_TEMPLATE - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_TEMPLATE = new ListKey<CampaignSourceEntry>();
	/** FILE_WEAPON_PROF - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_WEAPON_PROF = new ListKey<CampaignSourceEntry>();
	/** GAME_MODE - a ListKey */
	public static final ListKey<String> GAME_MODE = new ListKey<String>();
	/** KITS - a ListKey */
	public static final ListKey<String> KITS = new ListKey<String>();
	/** LICENSE - a ListKey */
	public static final ListKey<String> LICENSE = new ListKey<String>();
	/** LICENSE_FILE - a ListKey */
	public static final ListKey<URI> LICENSE_FILE = new ListKey<URI>();
	/** LINE - a ListKey */
	public static final ListKey<String> LINE = new ListKey<String>();
	/** LOGO - a ListKey */
	public static final ListKey<CampaignSourceEntry> FILE_LOGO = new ListKey<CampaignSourceEntry>();
	/** NATURAL_WEAPONS - a ListKey */
	public static final ListKey<Equipment> NATURAL_WEAPONS = new ListKey<Equipment>();
	/** PANTHEON - a ListKey */
	public static final ListKey<Pantheon> PANTHEON = new ListKey<Pantheon>();
	/** RACE_PANTHEON - a ListKey */
	public static final ListKey<String> RACEPANTHEON = new ListKey<String>();
	/** REMOVE_STRING_LIST - a ListKey */
	public static final ListKey<String> REMOVE_STRING_LIST = new ListKey<String>();
	/** SAVE - a ListKey */
	public static final ListKey<String> SAVE = new ListKey<String>();
	/** SECTION 15 - a ListKey */
	public static final ListKey<String> SECTION_15 = new ListKey<String>();
	/** SELECTED_ARMOR_PROFS - a ListKey */
	public static final ListKey<String> SELECTED_ARMOR_PROF = new ListKey<String>();
	/** SELECTED_SHIELD_PROFS - a ListKey */
	public static final ListKey<String> SELECTED_SHIELD_PROFS = new ListKey<String>();
	/** SELECTED_WEAPON_PROF_BONUS - a ListKey */
	public static final ListKey<String> SELECTED_WEAPON_PROF_BONUS = new ListKey<String>();
	/** SPECIAL_ABILITY - a ListKey */
	public static final ListKey<SpecialAbility> SPECIAL_ABILITY = new ListKey<SpecialAbility>();
	/** TEMPLATES - a ListKey */
	public static final ListKey<String> TEMPLATES = new ListKey<String>();
	/** TEMPLATES_ADDED - a ListKey */
	public static final ListKey<String> TEMPLATES_ADDED = new ListKey<String>();
	/** TEMP_BONUS - a ListKey */
	public static final ListKey<BonusObj> TEMP_BONUS = new ListKey<BonusObj>();
	/** UDAM - a ListKey */
	public static final ListKey<String> UDAM = new ListKey<String>();
	/** UMULT - a ListKey */
	public static final ListKey<String> UMULT = new ListKey<String>();
	/** Key for a list of virtual feats (feats granted regardless of the prereqs) */
	public static final ListKey<Ability> VIRTUAL_FEATS = new ListKey<Ability>();
//	/** Key for a list of weapon proficiencies */
//	public static final ListKey<String> WEAPON_PROF = new ListKey<String>();
	public static final ListKey<CampaignSourceEntry> FILE_ARMOR_PROF = new ListKey<CampaignSourceEntry>();
	public static final ListKey<CampaignSourceEntry> FILE_SHIELD_PROF = new ListKey<CampaignSourceEntry>();
	public static final ListKey<CDOMReference<WeaponProf>> DEITYWEAPON = new ListKey<CDOMReference<WeaponProf>>();
	public static final ListKey<CDOMReference<ClassSkillList>> CLASSES = new ListKey<CDOMReference<ClassSkillList>>();
	public static final ListKey<CDOMReference<ClassSkillList>> PREVENTED_CLASSES = new ListKey<CDOMReference<ClassSkillList>>();
	public static final ListKey<RaceSubType> RACESUBTYPE = new ListKey<RaceSubType>();
	public static final ListKey<RaceSubType> REMOVED_RACESUBTYPE = new ListKey<RaceSubType>();
	public static final ListKey<LevelCommandFactory> ADD_LEVEL = new ListKey<LevelCommandFactory>();
	public static final ListKey<String> RANGE = new ListKey<String>();
	public static final ListKey<String> SAVE_INFO = new ListKey<String>();
	public static final ListKey<String> DURATION = new ListKey<String>();
	public static final ListKey<String> COMPONENTS = new ListKey<String>();
	public static final ListKey<String> CASTTIME = new ListKey<String>();
	public static final ListKey<String> SPELL_RESISTANCE = new ListKey<String>();
	public static final ListKey<String> VARIANTS = new ListKey<String>();
	public static final ListKey<String> SPELL_SCHOOL = new ListKey<String>();
	public static final ListKey<String> SPELL_SUBSCHOOL = new ListKey<String>();
	public static final ListKey<String> SPELL_DESCRIPTOR = new ListKey<String>();
	public static final ListKey<String> PROHIBITED_ITEM = new ListKey<String>();
	public static final ListKey<String> ITEM = new ListKey<String>();
	public static final ListKey<Integer> HITDICE_ADVANCEMENT = new ListKey<Integer>();
	public static final ListKey<String> ITEM_TYPES = new ListKey<String>();
	public static final ListKey<CDOMSingleRef<EquipmentModifier>> REPLACED_KEYS = new ListKey<CDOMSingleRef<EquipmentModifier>>();
	public static final ListKey<SpecialProperty> SPECIAL_PROPERTIES = new ListKey<SpecialProperty>();
	public static final ListKey<ChangeArmorType> ARMORTYPE = new ListKey<ChangeArmorType>();
	public static final ListKey<Formula> SPECIALTYKNOWN = new ListKey<Formula>();
	public static final ListKey<Formula> KNOWN = new ListKey<Formula>();
	public static final ListKey<Formula> CAST = new ListKey<Formula>();
	public static final ListKey<QualifiedObject<CDOMSingleRef<Domain>>> DOMAIN = new ListKey<QualifiedObject<CDOMSingleRef<Domain>>>();

	/** Private constructor to prevent instantiation of this class */
	private ListKey() {
		//Only allow instantation here
	}
}
