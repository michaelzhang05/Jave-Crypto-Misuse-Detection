package androidx.compose.ui;

import a6.InterfaceC1669o;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

@Stable
/* loaded from: classes.dex */
final class KeyedComposedModifierN extends ComposedModifier {
    private final String fqName;
    private final Object[] keys;

    public KeyedComposedModifierN(String str, Object[] objArr, Function1 function1, InterfaceC1669o interfaceC1669o) {
        super(function1, interfaceC1669o);
        this.fqName = str;
        this.keys = objArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifierN) {
            KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
            if (AbstractC3255y.d(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys)) {
                return true;
            }
        }
        return false;
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
