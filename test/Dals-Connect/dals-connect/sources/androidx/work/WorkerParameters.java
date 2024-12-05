package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {
    private UUID a;

    /* renamed from: b, reason: collision with root package name */
    private e f1767b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f1768c;

    /* renamed from: d, reason: collision with root package name */
    private a f1769d;

    /* renamed from: e, reason: collision with root package name */
    private int f1770e;

    /* renamed from: f, reason: collision with root package name */
    private Executor f1771f;

    /* renamed from: g, reason: collision with root package name */
    private androidx.work.impl.utils.p.a f1772g;

    /* renamed from: h, reason: collision with root package name */
    private a0 f1773h;

    /* renamed from: i, reason: collision with root package name */
    private t f1774i;

    /* renamed from: j, reason: collision with root package name */
    private i f1775j;

    /* loaded from: classes.dex */
    public static class a {
        public List<String> a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        public List<Uri> f1776b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        public Network f1777c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i2, Executor executor, androidx.work.impl.utils.p.a aVar2, a0 a0Var, t tVar, i iVar) {
        this.a = uuid;
        this.f1767b = eVar;
        this.f1768c = new HashSet(collection);
        this.f1769d = aVar;
        this.f1770e = i2;
        this.f1771f = executor;
        this.f1772g = aVar2;
        this.f1773h = a0Var;
        this.f1774i = tVar;
        this.f1775j = iVar;
    }

    public Executor a() {
        return this.f1771f;
    }

    public i b() {
        return this.f1775j;
    }

    public UUID c() {
        return this.a;
    }

    public e d() {
        return this.f1767b;
    }

    public Network e() {
        return this.f1769d.f1777c;
    }

    public t f() {
        return this.f1774i;
    }

    public int g() {
        return this.f1770e;
    }

    public Set<String> h() {
        return this.f1768c;
    }

    public androidx.work.impl.utils.p.a i() {
        return this.f1772g;
    }

    public List<String> j() {
        return this.f1769d.a;
    }

    public List<Uri> k() {
        return this.f1769d.f1776b;
    }

    public a0 l() {
        return this.f1773h;
    }
}
