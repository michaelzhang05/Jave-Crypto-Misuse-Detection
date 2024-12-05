package androidx.room;

import android.content.Context;
import androidx.room.j;
import c.q.a.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration.java */
/* loaded from: classes.dex */
public class a {
    public final c.InterfaceC0077c a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1611b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1612c;

    /* renamed from: d, reason: collision with root package name */
    public final j.d f1613d;

    /* renamed from: e, reason: collision with root package name */
    public final List<j.b> f1614e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1615f;

    /* renamed from: g, reason: collision with root package name */
    public final j.c f1616g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f1617h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f1618i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1619j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1620k;
    public final boolean l;
    private final Set<Integer> m;
    public final String n;
    public final File o;

    public a(Context context, String str, c.InterfaceC0077c interfaceC0077c, j.d dVar, List<j.b> list, boolean z, j.c cVar, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.a = interfaceC0077c;
        this.f1611b = context;
        this.f1612c = str;
        this.f1613d = dVar;
        this.f1614e = list;
        this.f1615f = z;
        this.f1616g = cVar;
        this.f1617h = executor;
        this.f1618i = executor2;
        this.f1619j = z2;
        this.f1620k = z3;
        this.l = z4;
        this.m = set;
        this.n = str2;
        this.o = file;
    }

    public boolean a(int i2, int i3) {
        Set<Integer> set;
        return !((i2 > i3) && this.l) && this.f1620k && ((set = this.m) == null || !set.contains(Integer.valueOf(i2)));
    }
}
