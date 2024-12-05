package androidx.compose.ui;

import X5.o;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

@Stable
/* loaded from: classes.dex */
final class KeyedComposedModifier1 extends ComposedModifier {
    private final String fqName;
    private final Object key1;

    public KeyedComposedModifier1(String str, Object obj, Function1 function1, o oVar) {
        super(function1, oVar);
        this.fqName = str;
        this.key1 = obj;
    }

    public boolean equals(Object obj) {
        if (obj instanceof KeyedComposedModifier1) {
            KeyedComposedModifier1 keyedComposedModifier1 = (KeyedComposedModifier1) obj;
            if (AbstractC3159y.d(this.fqName, keyedComposedModifier1.fqName) && AbstractC3159y.d(this.key1, keyedComposedModifier1.key1)) {
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

    public int hashCode() {
        int i8;
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        if (obj != null) {
            i8 = obj.hashCode();
        } else {
            i8 = 0;
        }
        return hashCode + i8;
    }
}
