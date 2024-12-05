package h4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import e3.EnumC2791e;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import p4.A0;
import p4.z0;

/* loaded from: classes4.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final int f32395a = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f32396b = "cvc";

    /* renamed from: c, reason: collision with root package name */
    private final int f32397c = AbstractC3407E.f34853e0;

    /* renamed from: d, reason: collision with root package name */
    private final int f32398d = KeyboardType.Companion.m4924getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f32399e = VisualTransformation.Companion.getNone();

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
        if (brand.m() != -1) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (number.length() == 0) {
            return z0.a.f37883c;
        }
        if (brand == EnumC2791e.f31452w) {
            if (number.length() == i8) {
                return A0.a.f36968a;
            }
            return A0.b.f36969a;
        }
        if (z8 && number.length() < i8) {
            return new z0.b(AbstractC3407E.f34887v0);
        }
        if (z8 && number.length() > i8) {
            return new z0.c(AbstractC3407E.f34887v0, null, false, 6, null);
        }
        if (z8 && number.length() == i8) {
            return A0.a.f36968a;
        }
        return new z0.c(AbstractC3407E.f34887v0, null, false, 6, null);
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
        return this.f32395a;
    }

    public String f() {
        return this.f32396b;
    }

    public int g() {
        return this.f32398d;
    }

    public VisualTransformation h() {
        return this.f32399e;
    }
}
