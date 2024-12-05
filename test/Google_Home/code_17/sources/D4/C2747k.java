package d4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: d4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2747k extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final TextInputLayout f31202a;

    /* renamed from: b, reason: collision with root package name */
    private final TextInputEditText f31203b;

    public /* synthetic */ C2747k(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    public final TextInputLayout getInfoLabel$3ds2sdk_release() {
        return this.f31202a;
    }

    public final TextInputEditText getTextEntryView$3ds2sdk_release() {
        return this.f31203b;
    }

    public String getUserEntry() {
        String str;
        Editable text = this.f31203b.getText();
        if (text != null) {
            str = text.toString();
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void setText(String text) {
        AbstractC3255y.i(text, "text");
        this.f31203b.setText(text);
    }

    public final void setTextBoxCustomization(W3.o oVar) {
        if (oVar == null) {
            return;
        }
        String p8 = oVar.p();
        if (p8 != null) {
            this.f31203b.setTextColor(Color.parseColor(p8));
        }
        Integer valueOf = Integer.valueOf(oVar.u());
        if (valueOf.intValue() <= 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.f31203b.setTextSize(2, valueOf.intValue());
        }
        if (oVar.b() >= 0) {
            float b8 = oVar.b();
            this.f31202a.setBoxCornerRadii(b8, b8, b8, b8);
        }
        String s8 = oVar.s();
        if (s8 != null) {
            this.f31202a.setBoxBackgroundMode(2);
            this.f31202a.setBoxStrokeColor(Color.parseColor(s8));
        }
        String i8 = oVar.i();
        if (i8 != null) {
            this.f31202a.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(i8)));
        }
    }

    public final void setTextEntryLabel(String str) {
        this.f31202a.setHint(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2747k(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        T3.g c8 = T3.g.c(LayoutInflater.from(context), this, true);
        AbstractC3255y.h(c8, "inflate(...)");
        TextInputLayout label = c8.f10032b;
        AbstractC3255y.h(label, "label");
        this.f31202a = label;
        TextInputEditText textEntry = c8.f10033c;
        AbstractC3255y.h(textEntry, "textEntry");
        this.f31203b = textEntry;
    }
}
