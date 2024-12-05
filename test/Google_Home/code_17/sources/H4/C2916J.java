package h4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import e3.EnumC2791e;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import m2.C3416b;
import p4.A0;
import p4.z0;

/* renamed from: h4.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2916J {

    /* renamed from: a, reason: collision with root package name */
    private final int f32338a = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f32339b = "Card number";

    /* renamed from: c, reason: collision with root package name */
    private final int f32340c = AbstractC3407E.f34844a;

    /* renamed from: d, reason: collision with root package name */
    private final int f32341d = KeyboardType.Companion.m4924getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f32342e = new M(' ');

    public String a(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    public String b(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    public p4.y0 c(EnumC2791e brand, String number, int i8) {
        boolean z8;
        AbstractC3255y.i(brand, "brand");
        AbstractC3255y.i(number, "number");
        boolean a8 = C3416b.f34942a.a(number);
        if (brand.n(number) != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (j6.n.u(number)) {
            return z0.a.f37883c;
        }
        if (brand == EnumC2791e.f31452w) {
            return new z0.c(AbstractC3407E.f34885u0, null, true, 2, null);
        }
        if (z8 && number.length() < i8) {
            return new z0.b(AbstractC3407E.f34885u0);
        }
        if (!a8) {
            return new z0.c(AbstractC3407E.f34885u0, null, true, 2, null);
        }
        if (z8 && number.length() == i8) {
            return A0.a.f36968a;
        }
        return new z0.c(AbstractC3407E.f34885u0, null, false, 6, null);
    }

    public String d(String userTyped) {
        AbstractC3255y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return sb2;
    }

    public int e() {
        return this.f32338a;
    }

    public String f() {
        return this.f32339b;
    }

    public int g() {
        return this.f32341d;
    }

    public int h() {
        return this.f32340c;
    }

    public VisualTransformation i() {
        return this.f32342e;
    }
}
