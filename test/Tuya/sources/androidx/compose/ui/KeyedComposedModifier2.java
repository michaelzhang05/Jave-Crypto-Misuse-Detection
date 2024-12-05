package androidx.compose.ui;

import X5.o;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

@Stable
/* loaded from: classes.dex */
final class KeyedComposedModifier2 extends ComposedModifier {
    private final String fqName;
    private final Object key1;
    private final Object key2;

    public KeyedComposedModifier2(String str, Object obj, Object obj2, Function1 function1, o oVar) {
        super(function1, oVar);
        this.fqName = str;
        this.key1 = obj;
        this.key2 = obj2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifier2) {
            KeyedComposedModifier2 keyedComposedModifier2 = (KeyedComposedModifier2) obj;
            if (AbstractC3159y.d(this.fqName, keyedComposedModifier2.fqName) && AbstractC3159y.d(this.key1, keyedComposedModifier2.key1) && AbstractC3159y.d(this.key2, keyedComposedModifier2.key2)) {
                return true;
            }
        }
        return false;
    }

    public final String getFqName() {
        return this.fqName;
    }

    public final Object getKey1() {
        return this.key1;
    }

    public final Object getKey2() {
        return this.key2;
    }

    public int hashCode() {
        int i8;
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int i9 = 0;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        int i10 = (hashCode + i8) * 31;
        Object obj2 = this.key2;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i10 + i9;
    }
}
