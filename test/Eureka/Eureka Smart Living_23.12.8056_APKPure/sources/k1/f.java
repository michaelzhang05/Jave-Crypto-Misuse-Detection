package k1;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k1.c;

/* loaded from: classes.dex */
public abstract class f {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private n1.a f7109a;

        /* renamed from: b, reason: collision with root package name */
        private Map f7110b = new HashMap();

        public a a(b1.d dVar, b bVar) {
            this.f7110b.put(dVar, bVar);
            return this;
        }

        public f b() {
            if (this.f7109a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f7110b.keySet().size() < b1.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f7110b;
            this.f7110b = new HashMap();
            return f.d(this.f7109a, map);
        }

        public a c(n1.a aVar) {
            this.f7109a = aVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {

        /* loaded from: classes.dex */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j6);

            public abstract a c(Set set);

            public abstract a d(long j6);
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

    /* loaded from: classes.dex */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i6, long j6) {
        return (long) (Math.pow(3.0d, i6 - 1) * j6 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j6 > 1 ? j6 : 2L) * r7)));
    }

    public static a b() {
        return new a();
    }

    static f d(n1.a aVar, Map map) {
        return new k1.b(aVar, map);
    }

    public static f f(n1.a aVar) {
        return b().a(b1.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(b1.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(b1.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
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

    public JobInfo.Builder c(JobInfo.Builder builder, b1.d dVar, long j6, int i6) {
        builder.setMinimumLatency(g(dVar, j6, i6));
        j(builder, ((b) h().get(dVar)).c());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract n1.a e();

    public long g(b1.d dVar, long j6, int i6) {
        long a6 = j6 - e().a();
        b bVar = (b) h().get(dVar);
        return Math.min(Math.max(a(i6, bVar.b()), a6), bVar.d());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Map h();
}
