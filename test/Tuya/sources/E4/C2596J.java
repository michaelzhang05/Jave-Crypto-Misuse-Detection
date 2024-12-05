package e4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import b3.EnumC1870e;
import j2.AbstractC3053E;
import j2.C3062b;
import kotlin.jvm.internal.AbstractC3159y;
import m4.A0;
import m4.z0;

/* renamed from: e4.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2596J {

    /* renamed from: a, reason: collision with root package name */
    private final int f30417a = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f30418b = "Card number";

    /* renamed from: c, reason: collision with root package name */
    private final int f30419c = AbstractC3053E.f32868a;

    /* renamed from: d, reason: collision with root package name */
    private final int f30420d = KeyboardType.Companion.m4919getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f30421e = new M(' ');

    public String a(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        return rawValue;
    }

    public String b(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    public m4.y0 c(EnumC1870e brand, String number, int i8) {
        boolean z8;
        AbstractC3159y.i(brand, "brand");
        AbstractC3159y.i(number, "number");
        boolean a8 = C3062b.f32966a.a(number);
        if (brand.n(number) != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (g6.n.u(number)) {
            return z0.a.f35857c;
        }
        if (brand == EnumC1870e.f14446w) {
            return new z0.c(AbstractC3053E.f32909u0, null, true, 2, null);
        }
        if (z8 && number.length() < i8) {
            return new z0.b(AbstractC3053E.f32909u0);
        }
        if (!a8) {
            return new z0.c(AbstractC3053E.f32909u0, null, true, 2, null);
        }
        if (z8 && number.length() == i8) {
            return A0.a.f34942a;
        }
        return new z0.c(AbstractC3053E.f32909u0, null, false, 6, null);
    }

    public String d(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    public int e() {
        return this.f30417a;
    }

    public String f() {
        return this.f30418b;
    }

    public int g() {
        return this.f30420d;
    }

    public int h() {
        return this.f30419c;
    }

    public VisualTransformation i() {
        return this.f30421e;
    }
}
