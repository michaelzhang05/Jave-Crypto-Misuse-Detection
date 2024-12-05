package B;

import B.c;
import android.app.job.JobInfo;
import androidx.work.WorkRequest;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import s.EnumC3702d;

/* loaded from: classes3.dex */
public abstract class f {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private E.a f531a;

        /* renamed from: b, reason: collision with root package name */
        private Map f532b = new HashMap();

        public a a(EnumC3702d enumC3702d, b bVar) {
            this.f532b.put(enumC3702d, bVar);
            return this;
        }

        public f b() {
            if (this.f531a != null) {
                if (this.f532b.keySet().size() >= EnumC3702d.values().length) {
                    Map map = this.f532b;
                    this.f532b = new HashMap();
                    return f.d(this.f531a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public a c(E.a aVar) {
            this.f531a = aVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {

        /* loaded from: classes3.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j8);

            public abstract a c(Set set);

            public abstract a d(long j8);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Set c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract long d();
    }

    /* loaded from: classes3.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i8, long j8) {
        long j9;
        int i9 = i8 - 1;
        if (j8 > 1) {
            j9 = j8;
        } else {
            j9 = 2;
        }
        return (long) (Math.pow(3.0d, i9) * j8 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j9 * i9)));
    }

    public static a b() {
        return new a();
    }

    static f d(E.a aVar, Map map) {
        return new B.b(aVar, map);
    }

    public static f f(E.a aVar) {
        return b().a(EnumC3702d.DEFAULT, b.a().b(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).d(86400000L).a()).a(EnumC3702d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(EnumC3702d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    private void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, EnumC3702d enumC3702d, long j8, int i8) {
        builder.setMinimumLatency(g(enumC3702d, j8, i8));
        j(builder, ((b) h().get(enumC3702d)).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract E.a e();

    public long g(EnumC3702d enumC3702d, long j8, int i8) {
        long a8 = j8 - e().a();
        b bVar = (b) h().get(enumC3702d);
        return Math.min(Math.max(a(i8, bVar.b()), a8), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map h();
}
