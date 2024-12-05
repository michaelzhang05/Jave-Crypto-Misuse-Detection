package a4;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f13907a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f13908b;

    public l(String content, String str) {
        AbstractC3255y.i(content, "content");
        this.f13907a = content;
        boolean z8 = false;
        if (str != null && j6.n.C(str, "application/json", false, 2, null)) {
            z8 = true;
        }
        this.f13908b = z8;
    }

    public final String a() {
        return this.f13907a;
    }

    public final boolean b() {
        return this.f13908b;
    }
}
