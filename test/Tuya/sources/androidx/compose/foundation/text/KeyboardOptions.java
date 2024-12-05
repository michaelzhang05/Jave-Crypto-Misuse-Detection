package androidx.compose.foundation.text;

import androidx.compose.foundation.a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import kotlin.jvm.internal.AbstractC3151p;

@Immutable
/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, false, 0, 0, 15, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final int imeAction;
    private final int keyboardType;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        public /* synthetic */ Companion(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ KeyboardOptions(int i8, boolean z8, int i9, int i10, AbstractC3151p abstractC3151p) {
        this(i8, z8, i9, i10);
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m882copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i8, boolean z8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i8 = keyboardOptions.capitalization;
        }
        if ((i11 & 2) != 0) {
            z8 = keyboardOptions.autoCorrect;
        }
        if ((i11 & 4) != 0) {
            i9 = keyboardOptions.keyboardType;
        }
        if ((i11 & 8) != 0) {
            i10 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m883copy3m2b7yw(i8, z8, i9, i10);
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z8);
    }

    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final KeyboardOptions m883copy3m2b7yw(int i8, boolean z8, int i9, int i10) {
        return new KeyboardOptions(i8, z8, i9, i10, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        if (KeyboardCapitalization.m4887equalsimpl0(this.capitalization, keyboardOptions.capitalization) && this.autoCorrect == keyboardOptions.autoCorrect && KeyboardType.m4902equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m4855equalsimpl0(this.imeAction, keyboardOptions.imeAction)) {
            return true;
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m884getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m885getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m886getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public int hashCode() {
        return (((((KeyboardCapitalization.m4888hashCodeimpl(this.capitalization) * 31) + a.a(this.autoCorrect)) * 31) + KeyboardType.m4903hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m4856hashCodeimpl(this.imeAction);
    }

    public final ImeOptions toImeOptions$foundation_release(boolean z8) {
        return new ImeOptions(z8, this.capitalization, this.autoCorrect, this.keyboardType, this.imeAction, (AbstractC3151p) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m4889toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m4904toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m4857toStringimpl(this.imeAction)) + ')';
    }

    private KeyboardOptions(int i8, boolean z8, int i9, int i10) {
        this.capitalization = i8;
        this.autoCorrect = z8;
        this.keyboardType = i9;
        this.imeAction = i10;
    }

    public /* synthetic */ KeyboardOptions(int i8, boolean z8, int i9, int i10, int i11, AbstractC3151p abstractC3151p) {
        this((i11 & 1) != 0 ? KeyboardCapitalization.Companion.m4896getNoneIUNYP9k() : i8, (i11 & 2) != 0 ? true : z8, (i11 & 4) != 0 ? KeyboardType.Companion.m4922getTextPjHm6EE() : i9, (i11 & 8) != 0 ? ImeAction.Companion.m4867getDefaulteUduSuo() : i10, null);
    }
}
