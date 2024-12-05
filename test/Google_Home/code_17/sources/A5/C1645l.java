package a5;

import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3677q;

/* renamed from: a5.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1645l {

    /* renamed from: a, reason: collision with root package name */
    public String f14262a;

    /* renamed from: b, reason: collision with root package name */
    public String f14263b;

    /* renamed from: c, reason: collision with root package name */
    private int f14264c = -1;

    public final String a() {
        String str = this.f14263b;
        if (str != null) {
            return str;
        }
        AbstractC3255y.y("date");
        return null;
    }

    public final int b() {
        return this.f14264c;
    }

    public final String c() {
        String substring = e().substring(j6.n.X(e(), "/", 0, false, 6, null) + 1);
        AbstractC3255y.h(substring, "substring(...)");
        return substring;
    }

    public final String d() {
        return new C3677q().i(c());
    }

    public final String e() {
        String str = this.f14262a;
        if (str != null) {
            return str;
        }
        AbstractC3255y.y(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        return null;
    }

    public final void f(String str) {
        AbstractC3255y.i(str, "<set-?>");
        this.f14263b = str;
    }

    public final void g(int i8) {
        this.f14264c = i8;
    }

    public final void h(String str) {
        AbstractC3255y.i(str, "<set-?>");
        this.f14262a = str;
    }
}
