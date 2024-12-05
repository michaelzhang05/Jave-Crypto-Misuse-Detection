package androidx.preference;

import a6.InterfaceC1668n;
import i6.InterfaceC2998g;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class PreferenceGroupKt {
    public static final boolean contains(PreferenceGroup preferenceGroup, Preference preference) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        AbstractC3255y.i(preference, "preference");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        int i8 = 0;
        while (i8 < preferenceCount) {
            int i9 = i8 + 1;
            if (AbstractC3255y.d(preferenceGroup.getPreference(i8), preference)) {
                return true;
            }
            i8 = i9;
        }
        return false;
    }

    public static final void forEach(PreferenceGroup preferenceGroup, Function1 action) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        AbstractC3255y.i(action, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            action.invoke(get(preferenceGroup, i8));
        }
    }

    public static final void forEachIndexed(PreferenceGroup preferenceGroup, InterfaceC1668n action) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        AbstractC3255y.i(action, "action");
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i8 = 0; i8 < preferenceCount; i8++) {
            action.invoke(Integer.valueOf(i8), get(preferenceGroup, i8));
        }
    }

    public static final <T extends Preference> T get(PreferenceGroup preferenceGroup, CharSequence key) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        AbstractC3255y.i(key, "key");
        return (T) preferenceGroup.findPreference(key);
    }

    public static final InterfaceC2998g getChildren(final PreferenceGroup preferenceGroup) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        return new InterfaceC2998g() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // i6.InterfaceC2998g
            public Iterator<Preference> iterator() {
                return PreferenceGroupKt.iterator(PreferenceGroup.this);
            }
        };
    }

    public static final int getSize(PreferenceGroup preferenceGroup) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        return preferenceGroup.getPreferenceCount();
    }

    public static final boolean isEmpty(PreferenceGroup preferenceGroup) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        if (preferenceGroup.getPreferenceCount() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(PreferenceGroup preferenceGroup) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        if (preferenceGroup.getPreferenceCount() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<Preference> iterator(PreferenceGroup preferenceGroup) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        return new PreferenceGroupKt$iterator$1(preferenceGroup);
    }

    public static final void minusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        AbstractC3255y.i(preference, "preference");
        preferenceGroup.removePreference(preference);
    }

    public static final void plusAssign(PreferenceGroup preferenceGroup, Preference preference) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        AbstractC3255y.i(preference, "preference");
        preferenceGroup.addPreference(preference);
    }

    public static final Preference get(PreferenceGroup preferenceGroup, int i8) {
        AbstractC3255y.i(preferenceGroup, "<this>");
        Preference preference = preferenceGroup.getPreference(i8);
        AbstractC3255y.h(preference, "getPreference(index)");
        return preference;
    }
}
