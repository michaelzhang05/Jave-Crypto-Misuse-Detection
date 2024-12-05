package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.sdk.f3;
import com.flurry.sdk.v3;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e3 implements f3 {

    /* renamed from: k, reason: collision with root package name */
    private final Set<Integer> f9831k = new HashSet();
    private final Set<Integer> l = new HashSet();
    private final Set<String> m = new HashSet();
    private final Set<Integer> n = new HashSet();
    private final Set<Integer> o = new HashSet();

    private static boolean c(v3 v3Var) {
        return v3Var.f10216g && !v3Var.f10217h;
    }

    @Override // com.flurry.sdk.f3
    public final void a() {
        this.f9831k.clear();
        this.l.clear();
        this.m.clear();
        this.n.clear();
        this.o.clear();
    }

    @Override // com.flurry.sdk.f3
    public final f3.a b(u6 u6Var) {
        if (u6Var.a().equals(s6.FLUSH_FRAME)) {
            return new f3.a(f3.b.DO_NOT_DROP, new w3(new x3(this.f9831k.size(), this.l.isEmpty())));
        }
        if (!u6Var.a().equals(s6.ANALYTICS_EVENT)) {
            return f3.a;
        }
        v3 v3Var = (v3) u6Var.f();
        String str = v3Var.f10211b;
        int i2 = v3Var.f10212c;
        this.f9831k.add(Integer.valueOf(i2));
        if (v3Var.f10213d != v3.a.CUSTOM) {
            if (this.o.size() >= 1000 && !c(v3Var)) {
                this.l.add(Integer.valueOf(i2));
                return f3.f9859e;
            }
            this.o.add(Integer.valueOf(i2));
            return f3.a;
        }
        if (TextUtils.isEmpty(str)) {
            this.l.add(Integer.valueOf(i2));
            return f3.f9857c;
        }
        if (c(v3Var) && !this.n.contains(Integer.valueOf(i2))) {
            this.l.add(Integer.valueOf(i2));
            return f3.f9860f;
        }
        if (this.n.size() >= 1000 && !c(v3Var)) {
            this.l.add(Integer.valueOf(i2));
            return f3.f9858d;
        }
        if (!this.m.contains(str) && this.m.size() >= 500) {
            this.l.add(Integer.valueOf(i2));
            return f3.f9856b;
        }
        this.m.add(str);
        this.n.add(Integer.valueOf(i2));
        return f3.a;
    }
}
