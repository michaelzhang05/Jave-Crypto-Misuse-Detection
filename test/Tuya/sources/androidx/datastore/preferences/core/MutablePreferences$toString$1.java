package androidx.datastore.preferences.core;

import M5.AbstractC1239l;
import androidx.datastore.preferences.core.Preferences;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
final class MutablePreferences$toString$1 extends AbstractC3160z implements Function1 {
    public static final MutablePreferences$toString$1 INSTANCE = new MutablePreferences$toString$1();

    MutablePreferences$toString$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Map.Entry<Preferences.Key<?>, Object> entry) {
        AbstractC3159y.i(entry, "entry");
        Object value = entry.getValue();
        return "  " + entry.getKey().getName() + " = " + (value instanceof byte[] ? AbstractC1239l.x0((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
    }
}
