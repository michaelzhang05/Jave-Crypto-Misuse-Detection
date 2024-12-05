package androidx.work.impl.n;

import android.database.Cursor;
import androidx.work.impl.n.p;
import androidx.work.x;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes.dex */
public final class r implements q {
    private final androidx.room.j a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.room.c<p> f2028b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.room.q f2029c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.room.q f2030d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.room.q f2031e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.room.q f2032f;

    /* renamed from: g, reason: collision with root package name */
    private final androidx.room.q f2033g;

    /* renamed from: h, reason: collision with root package name */
    private final androidx.room.q f2034h;

    /* renamed from: i, reason: collision with root package name */
    private final androidx.room.q f2035i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.room.q f2036j;

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.c<p> {
        a(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void bind(c.q.a.f fVar, p pVar) {
            String str = pVar.f2018c;
            if (str == null) {
                fVar.a0(1);
            } else {
                fVar.m(1, str);
            }
            fVar.F(2, v.j(pVar.f2019d));
            String str2 = pVar.f2020e;
            if (str2 == null) {
                fVar.a0(3);
            } else {
                fVar.m(3, str2);
            }
            String str3 = pVar.f2021f;
            if (str3 == null) {
                fVar.a0(4);
            } else {
                fVar.m(4, str3);
            }
            byte[] l = androidx.work.e.l(pVar.f2022g);
            if (l == null) {
                fVar.a0(5);
            } else {
                fVar.K(5, l);
            }
            byte[] l2 = androidx.work.e.l(pVar.f2023h);
            if (l2 == null) {
                fVar.a0(6);
            } else {
                fVar.K(6, l2);
            }
            fVar.F(7, pVar.f2024i);
            fVar.F(8, pVar.f2025j);
            fVar.F(9, pVar.f2026k);
            fVar.F(10, pVar.m);
            fVar.F(11, v.a(pVar.n));
            fVar.F(12, pVar.o);
            fVar.F(13, pVar.p);
            fVar.F(14, pVar.q);
            fVar.F(15, pVar.r);
            fVar.F(16, pVar.s ? 1L : 0L);
            fVar.F(17, v.i(pVar.t));
            androidx.work.c cVar = pVar.l;
            if (cVar != null) {
                fVar.F(18, v.h(cVar.b()));
                fVar.F(19, cVar.g() ? 1L : 0L);
                fVar.F(20, cVar.h() ? 1L : 0L);
                fVar.F(21, cVar.f() ? 1L : 0L);
                fVar.F(22, cVar.i() ? 1L : 0L);
                fVar.F(23, cVar.c());
                fVar.F(24, cVar.d());
                byte[] c2 = v.c(cVar.a());
                if (c2 == null) {
                    fVar.a0(25);
                    return;
                } else {
                    fVar.K(25, c2);
                    return;
                }
            }
            fVar.a0(18);
            fVar.a0(19);
            fVar.a0(20);
            fVar.a0(21);
            fVar.a0(22);
            fVar.a0(23);
            fVar.a0(24);
            fVar.a0(25);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class b extends androidx.room.q {
        b(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class c extends androidx.room.q {
        c(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class d extends androidx.room.q {
        d(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class e extends androidx.room.q {
        e(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class f extends androidx.room.q {
        f(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class g extends androidx.room.q {
        g(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class h extends androidx.room.q {
        h(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* compiled from: WorkSpecDao_Impl.java */
    /* loaded from: classes.dex */
    class i extends androidx.room.q {
        i(androidx.room.j jVar) {
            super(jVar);
        }

        @Override // androidx.room.q
        public String createQuery() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(androidx.room.j jVar) {
        this.a = jVar;
        this.f2028b = new a(jVar);
        this.f2029c = new b(jVar);
        this.f2030d = new c(jVar);
        this.f2031e = new d(jVar);
        this.f2032f = new e(jVar);
        this.f2033g = new f(jVar);
        this.f2034h = new g(jVar);
        this.f2035i = new h(jVar);
        this.f2036j = new i(jVar);
    }

    @Override // androidx.work.impl.n.q
    public int a(x xVar, String... strArr) {
        this.a.assertNotSuspendingTransaction();
        StringBuilder b2 = androidx.room.t.f.b();
        b2.append("UPDATE workspec SET state=");
        b2.append("?");
        b2.append(" WHERE id IN (");
        androidx.room.t.f.a(b2, strArr.length);
        b2.append(")");
        c.q.a.f compileStatement = this.a.compileStatement(b2.toString());
        compileStatement.F(1, v.j(xVar));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.a0(i2);
            } else {
                compileStatement.m(i2, str);
            }
            i2++;
        }
        this.a.beginTransaction();
        try {
            int p = compileStatement.p();
            this.a.setTransactionSuccessful();
            return p;
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // androidx.work.impl.n.q
    public int b(String str, long j2) {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2034h.acquire();
        acquire.F(1, j2);
        if (str == null) {
            acquire.a0(2);
        } else {
            acquire.m(2, str);
        }
        this.a.beginTransaction();
        try {
            int p = acquire.p();
            this.a.setTransactionSuccessful();
            return p;
        } finally {
            this.a.endTransaction();
            this.f2034h.release(acquire);
        }
    }

    @Override // androidx.work.impl.n.q
    public List<p.b> c(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            int b3 = androidx.room.t.b.b(b2, DeepLinkIntentReceiver.DeepLinksKeys.ID);
            int b4 = androidx.room.t.b.b(b2, "state");
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                p.b bVar = new p.b();
                bVar.a = b2.getString(b3);
                bVar.f2027b = v.g(b2.getInt(b4));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.q
    public List<p> d(long j2) {
        androidx.room.m mVar;
        androidx.room.m f2 = androidx.room.m.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        f2.F(1, j2);
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            int b3 = androidx.room.t.b.b(b2, "required_network_type");
            int b4 = androidx.room.t.b.b(b2, "requires_charging");
            int b5 = androidx.room.t.b.b(b2, "requires_device_idle");
            int b6 = androidx.room.t.b.b(b2, "requires_battery_not_low");
            int b7 = androidx.room.t.b.b(b2, "requires_storage_not_low");
            int b8 = androidx.room.t.b.b(b2, "trigger_content_update_delay");
            int b9 = androidx.room.t.b.b(b2, "trigger_max_content_delay");
            int b10 = androidx.room.t.b.b(b2, "content_uri_triggers");
            int b11 = androidx.room.t.b.b(b2, DeepLinkIntentReceiver.DeepLinksKeys.ID);
            int b12 = androidx.room.t.b.b(b2, "state");
            int b13 = androidx.room.t.b.b(b2, "worker_class_name");
            int b14 = androidx.room.t.b.b(b2, "input_merger_class_name");
            int b15 = androidx.room.t.b.b(b2, "input");
            int b16 = androidx.room.t.b.b(b2, "output");
            mVar = f2;
            try {
                int b17 = androidx.room.t.b.b(b2, "initial_delay");
                int b18 = androidx.room.t.b.b(b2, "interval_duration");
                int b19 = androidx.room.t.b.b(b2, "flex_duration");
                int b20 = androidx.room.t.b.b(b2, "run_attempt_count");
                int b21 = androidx.room.t.b.b(b2, "backoff_policy");
                int b22 = androidx.room.t.b.b(b2, "backoff_delay_duration");
                int b23 = androidx.room.t.b.b(b2, "period_start_time");
                int b24 = androidx.room.t.b.b(b2, "minimum_retention_duration");
                int b25 = androidx.room.t.b.b(b2, "schedule_requested_at");
                int b26 = androidx.room.t.b.b(b2, "run_in_foreground");
                int b27 = androidx.room.t.b.b(b2, "out_of_quota_policy");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i3 = b11;
                    String string2 = b2.getString(b13);
                    int i4 = b13;
                    androidx.work.c cVar = new androidx.work.c();
                    int i5 = b3;
                    cVar.k(v.e(b2.getInt(b3)));
                    cVar.m(b2.getInt(b4) != 0);
                    cVar.n(b2.getInt(b5) != 0);
                    cVar.l(b2.getInt(b6) != 0);
                    cVar.o(b2.getInt(b7) != 0);
                    int i6 = b4;
                    int i7 = b5;
                    cVar.p(b2.getLong(b8));
                    cVar.q(b2.getLong(b9));
                    cVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.f2019d = v.g(b2.getInt(b12));
                    pVar.f2021f = b2.getString(b14);
                    pVar.f2022g = androidx.work.e.g(b2.getBlob(b15));
                    int i8 = i2;
                    pVar.f2023h = androidx.work.e.g(b2.getBlob(i8));
                    int i9 = b17;
                    i2 = i8;
                    pVar.f2024i = b2.getLong(i9);
                    int i10 = b14;
                    int i11 = b18;
                    pVar.f2025j = b2.getLong(i11);
                    int i12 = b6;
                    int i13 = b19;
                    pVar.f2026k = b2.getLong(i13);
                    int i14 = b20;
                    pVar.m = b2.getInt(i14);
                    int i15 = b21;
                    pVar.n = v.d(b2.getInt(i15));
                    b19 = i13;
                    int i16 = b22;
                    pVar.o = b2.getLong(i16);
                    int i17 = b23;
                    pVar.p = b2.getLong(i17);
                    b23 = i17;
                    int i18 = b24;
                    pVar.q = b2.getLong(i18);
                    int i19 = b25;
                    pVar.r = b2.getLong(i19);
                    int i20 = b26;
                    pVar.s = b2.getInt(i20) != 0;
                    int i21 = b27;
                    pVar.t = v.f(b2.getInt(i21));
                    pVar.l = cVar;
                    arrayList.add(pVar);
                    b4 = i6;
                    b27 = i21;
                    b14 = i10;
                    b17 = i9;
                    b18 = i11;
                    b20 = i14;
                    b25 = i19;
                    b11 = i3;
                    b13 = i4;
                    b3 = i5;
                    b26 = i20;
                    b24 = i18;
                    b5 = i7;
                    b22 = i16;
                    b6 = i12;
                    b21 = i15;
                }
                b2.close();
                mVar.z();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                mVar.z();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = f2;
        }
    }

    @Override // androidx.work.impl.n.q
    public void delete(String str) {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2029c.acquire();
        if (str == null) {
            acquire.a0(1);
        } else {
            acquire.m(1, str);
        }
        this.a.beginTransaction();
        try {
            acquire.p();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f2029c.release(acquire);
        }
    }

    @Override // androidx.work.impl.n.q
    public List<p> e(int i2) {
        androidx.room.m mVar;
        androidx.room.m f2 = androidx.room.m.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        f2.F(1, i2);
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            int b3 = androidx.room.t.b.b(b2, "required_network_type");
            int b4 = androidx.room.t.b.b(b2, "requires_charging");
            int b5 = androidx.room.t.b.b(b2, "requires_device_idle");
            int b6 = androidx.room.t.b.b(b2, "requires_battery_not_low");
            int b7 = androidx.room.t.b.b(b2, "requires_storage_not_low");
            int b8 = androidx.room.t.b.b(b2, "trigger_content_update_delay");
            int b9 = androidx.room.t.b.b(b2, "trigger_max_content_delay");
            int b10 = androidx.room.t.b.b(b2, "content_uri_triggers");
            int b11 = androidx.room.t.b.b(b2, DeepLinkIntentReceiver.DeepLinksKeys.ID);
            int b12 = androidx.room.t.b.b(b2, "state");
            int b13 = androidx.room.t.b.b(b2, "worker_class_name");
            int b14 = androidx.room.t.b.b(b2, "input_merger_class_name");
            int b15 = androidx.room.t.b.b(b2, "input");
            int b16 = androidx.room.t.b.b(b2, "output");
            mVar = f2;
            try {
                int b17 = androidx.room.t.b.b(b2, "initial_delay");
                int b18 = androidx.room.t.b.b(b2, "interval_duration");
                int b19 = androidx.room.t.b.b(b2, "flex_duration");
                int b20 = androidx.room.t.b.b(b2, "run_attempt_count");
                int b21 = androidx.room.t.b.b(b2, "backoff_policy");
                int b22 = androidx.room.t.b.b(b2, "backoff_delay_duration");
                int b23 = androidx.room.t.b.b(b2, "period_start_time");
                int b24 = androidx.room.t.b.b(b2, "minimum_retention_duration");
                int b25 = androidx.room.t.b.b(b2, "schedule_requested_at");
                int b26 = androidx.room.t.b.b(b2, "run_in_foreground");
                int b27 = androidx.room.t.b.b(b2, "out_of_quota_policy");
                int i3 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i4 = b11;
                    String string2 = b2.getString(b13);
                    int i5 = b13;
                    androidx.work.c cVar = new androidx.work.c();
                    int i6 = b3;
                    cVar.k(v.e(b2.getInt(b3)));
                    cVar.m(b2.getInt(b4) != 0);
                    cVar.n(b2.getInt(b5) != 0);
                    cVar.l(b2.getInt(b6) != 0);
                    cVar.o(b2.getInt(b7) != 0);
                    int i7 = b4;
                    int i8 = b5;
                    cVar.p(b2.getLong(b8));
                    cVar.q(b2.getLong(b9));
                    cVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.f2019d = v.g(b2.getInt(b12));
                    pVar.f2021f = b2.getString(b14);
                    pVar.f2022g = androidx.work.e.g(b2.getBlob(b15));
                    int i9 = i3;
                    pVar.f2023h = androidx.work.e.g(b2.getBlob(i9));
                    i3 = i9;
                    int i10 = b17;
                    pVar.f2024i = b2.getLong(i10);
                    int i11 = b14;
                    int i12 = b18;
                    pVar.f2025j = b2.getLong(i12);
                    int i13 = b6;
                    int i14 = b19;
                    pVar.f2026k = b2.getLong(i14);
                    int i15 = b20;
                    pVar.m = b2.getInt(i15);
                    int i16 = b21;
                    pVar.n = v.d(b2.getInt(i16));
                    b19 = i14;
                    int i17 = b22;
                    pVar.o = b2.getLong(i17);
                    int i18 = b23;
                    pVar.p = b2.getLong(i18);
                    b23 = i18;
                    int i19 = b24;
                    pVar.q = b2.getLong(i19);
                    int i20 = b25;
                    pVar.r = b2.getLong(i20);
                    int i21 = b26;
                    pVar.s = b2.getInt(i21) != 0;
                    int i22 = b27;
                    pVar.t = v.f(b2.getInt(i22));
                    pVar.l = cVar;
                    arrayList.add(pVar);
                    b27 = i22;
                    b4 = i7;
                    b14 = i11;
                    b17 = i10;
                    b18 = i12;
                    b20 = i15;
                    b25 = i20;
                    b11 = i4;
                    b13 = i5;
                    b3 = i6;
                    b26 = i21;
                    b24 = i19;
                    b5 = i8;
                    b22 = i17;
                    b6 = i13;
                    b21 = i16;
                }
                b2.close();
                mVar.z();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                mVar.z();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = f2;
        }
    }

    @Override // androidx.work.impl.n.q
    public void f(p pVar) {
        this.a.assertNotSuspendingTransaction();
        this.a.beginTransaction();
        try {
            this.f2028b.insert((androidx.room.c<p>) pVar);
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
        }
    }

    @Override // androidx.work.impl.n.q
    public List<p> g() {
        androidx.room.m mVar;
        androidx.room.m f2 = androidx.room.m.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            int b3 = androidx.room.t.b.b(b2, "required_network_type");
            int b4 = androidx.room.t.b.b(b2, "requires_charging");
            int b5 = androidx.room.t.b.b(b2, "requires_device_idle");
            int b6 = androidx.room.t.b.b(b2, "requires_battery_not_low");
            int b7 = androidx.room.t.b.b(b2, "requires_storage_not_low");
            int b8 = androidx.room.t.b.b(b2, "trigger_content_update_delay");
            int b9 = androidx.room.t.b.b(b2, "trigger_max_content_delay");
            int b10 = androidx.room.t.b.b(b2, "content_uri_triggers");
            int b11 = androidx.room.t.b.b(b2, DeepLinkIntentReceiver.DeepLinksKeys.ID);
            int b12 = androidx.room.t.b.b(b2, "state");
            int b13 = androidx.room.t.b.b(b2, "worker_class_name");
            int b14 = androidx.room.t.b.b(b2, "input_merger_class_name");
            int b15 = androidx.room.t.b.b(b2, "input");
            int b16 = androidx.room.t.b.b(b2, "output");
            mVar = f2;
            try {
                int b17 = androidx.room.t.b.b(b2, "initial_delay");
                int b18 = androidx.room.t.b.b(b2, "interval_duration");
                int b19 = androidx.room.t.b.b(b2, "flex_duration");
                int b20 = androidx.room.t.b.b(b2, "run_attempt_count");
                int b21 = androidx.room.t.b.b(b2, "backoff_policy");
                int b22 = androidx.room.t.b.b(b2, "backoff_delay_duration");
                int b23 = androidx.room.t.b.b(b2, "period_start_time");
                int b24 = androidx.room.t.b.b(b2, "minimum_retention_duration");
                int b25 = androidx.room.t.b.b(b2, "schedule_requested_at");
                int b26 = androidx.room.t.b.b(b2, "run_in_foreground");
                int b27 = androidx.room.t.b.b(b2, "out_of_quota_policy");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i3 = b11;
                    String string2 = b2.getString(b13);
                    int i4 = b13;
                    androidx.work.c cVar = new androidx.work.c();
                    int i5 = b3;
                    cVar.k(v.e(b2.getInt(b3)));
                    cVar.m(b2.getInt(b4) != 0);
                    cVar.n(b2.getInt(b5) != 0);
                    cVar.l(b2.getInt(b6) != 0);
                    cVar.o(b2.getInt(b7) != 0);
                    int i6 = b4;
                    int i7 = b5;
                    cVar.p(b2.getLong(b8));
                    cVar.q(b2.getLong(b9));
                    cVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.f2019d = v.g(b2.getInt(b12));
                    pVar.f2021f = b2.getString(b14);
                    pVar.f2022g = androidx.work.e.g(b2.getBlob(b15));
                    int i8 = i2;
                    pVar.f2023h = androidx.work.e.g(b2.getBlob(i8));
                    i2 = i8;
                    int i9 = b17;
                    pVar.f2024i = b2.getLong(i9);
                    int i10 = b15;
                    int i11 = b18;
                    pVar.f2025j = b2.getLong(i11);
                    int i12 = b6;
                    int i13 = b19;
                    pVar.f2026k = b2.getLong(i13);
                    int i14 = b20;
                    pVar.m = b2.getInt(i14);
                    int i15 = b21;
                    pVar.n = v.d(b2.getInt(i15));
                    b19 = i13;
                    int i16 = b22;
                    pVar.o = b2.getLong(i16);
                    int i17 = b23;
                    pVar.p = b2.getLong(i17);
                    b23 = i17;
                    int i18 = b24;
                    pVar.q = b2.getLong(i18);
                    int i19 = b25;
                    pVar.r = b2.getLong(i19);
                    int i20 = b26;
                    pVar.s = b2.getInt(i20) != 0;
                    int i21 = b27;
                    pVar.t = v.f(b2.getInt(i21));
                    pVar.l = cVar;
                    arrayList.add(pVar);
                    b27 = i21;
                    b4 = i6;
                    b15 = i10;
                    b17 = i9;
                    b18 = i11;
                    b20 = i14;
                    b25 = i19;
                    b11 = i3;
                    b13 = i4;
                    b3 = i5;
                    b26 = i20;
                    b24 = i18;
                    b5 = i7;
                    b22 = i16;
                    b6 = i12;
                    b21 = i15;
                }
                b2.close();
                mVar.z();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                mVar.z();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = f2;
        }
    }

    @Override // androidx.work.impl.n.q
    public void h(String str, androidx.work.e eVar) {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2030d.acquire();
        byte[] l = androidx.work.e.l(eVar);
        if (l == null) {
            acquire.a0(1);
        } else {
            acquire.K(1, l);
        }
        if (str == null) {
            acquire.a0(2);
        } else {
            acquire.m(2, str);
        }
        this.a.beginTransaction();
        try {
            acquire.p();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f2030d.release(acquire);
        }
    }

    @Override // androidx.work.impl.n.q
    public List<p> i() {
        androidx.room.m mVar;
        androidx.room.m f2 = androidx.room.m.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            int b3 = androidx.room.t.b.b(b2, "required_network_type");
            int b4 = androidx.room.t.b.b(b2, "requires_charging");
            int b5 = androidx.room.t.b.b(b2, "requires_device_idle");
            int b6 = androidx.room.t.b.b(b2, "requires_battery_not_low");
            int b7 = androidx.room.t.b.b(b2, "requires_storage_not_low");
            int b8 = androidx.room.t.b.b(b2, "trigger_content_update_delay");
            int b9 = androidx.room.t.b.b(b2, "trigger_max_content_delay");
            int b10 = androidx.room.t.b.b(b2, "content_uri_triggers");
            int b11 = androidx.room.t.b.b(b2, DeepLinkIntentReceiver.DeepLinksKeys.ID);
            int b12 = androidx.room.t.b.b(b2, "state");
            int b13 = androidx.room.t.b.b(b2, "worker_class_name");
            int b14 = androidx.room.t.b.b(b2, "input_merger_class_name");
            int b15 = androidx.room.t.b.b(b2, "input");
            int b16 = androidx.room.t.b.b(b2, "output");
            mVar = f2;
            try {
                int b17 = androidx.room.t.b.b(b2, "initial_delay");
                int b18 = androidx.room.t.b.b(b2, "interval_duration");
                int b19 = androidx.room.t.b.b(b2, "flex_duration");
                int b20 = androidx.room.t.b.b(b2, "run_attempt_count");
                int b21 = androidx.room.t.b.b(b2, "backoff_policy");
                int b22 = androidx.room.t.b.b(b2, "backoff_delay_duration");
                int b23 = androidx.room.t.b.b(b2, "period_start_time");
                int b24 = androidx.room.t.b.b(b2, "minimum_retention_duration");
                int b25 = androidx.room.t.b.b(b2, "schedule_requested_at");
                int b26 = androidx.room.t.b.b(b2, "run_in_foreground");
                int b27 = androidx.room.t.b.b(b2, "out_of_quota_policy");
                int i2 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i3 = b11;
                    String string2 = b2.getString(b13);
                    int i4 = b13;
                    androidx.work.c cVar = new androidx.work.c();
                    int i5 = b3;
                    cVar.k(v.e(b2.getInt(b3)));
                    cVar.m(b2.getInt(b4) != 0);
                    cVar.n(b2.getInt(b5) != 0);
                    cVar.l(b2.getInt(b6) != 0);
                    cVar.o(b2.getInt(b7) != 0);
                    int i6 = b4;
                    int i7 = b5;
                    cVar.p(b2.getLong(b8));
                    cVar.q(b2.getLong(b9));
                    cVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.f2019d = v.g(b2.getInt(b12));
                    pVar.f2021f = b2.getString(b14);
                    pVar.f2022g = androidx.work.e.g(b2.getBlob(b15));
                    int i8 = i2;
                    pVar.f2023h = androidx.work.e.g(b2.getBlob(i8));
                    i2 = i8;
                    int i9 = b17;
                    pVar.f2024i = b2.getLong(i9);
                    int i10 = b15;
                    int i11 = b18;
                    pVar.f2025j = b2.getLong(i11);
                    int i12 = b6;
                    int i13 = b19;
                    pVar.f2026k = b2.getLong(i13);
                    int i14 = b20;
                    pVar.m = b2.getInt(i14);
                    int i15 = b21;
                    pVar.n = v.d(b2.getInt(i15));
                    b19 = i13;
                    int i16 = b22;
                    pVar.o = b2.getLong(i16);
                    int i17 = b23;
                    pVar.p = b2.getLong(i17);
                    b23 = i17;
                    int i18 = b24;
                    pVar.q = b2.getLong(i18);
                    int i19 = b25;
                    pVar.r = b2.getLong(i19);
                    int i20 = b26;
                    pVar.s = b2.getInt(i20) != 0;
                    int i21 = b27;
                    pVar.t = v.f(b2.getInt(i21));
                    pVar.l = cVar;
                    arrayList.add(pVar);
                    b27 = i21;
                    b4 = i6;
                    b15 = i10;
                    b17 = i9;
                    b18 = i11;
                    b20 = i14;
                    b25 = i19;
                    b11 = i3;
                    b13 = i4;
                    b3 = i5;
                    b26 = i20;
                    b24 = i18;
                    b5 = i7;
                    b22 = i16;
                    b6 = i12;
                    b21 = i15;
                }
                b2.close();
                mVar.z();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                mVar.z();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = f2;
        }
    }

    @Override // androidx.work.impl.n.q
    public boolean j() {
        boolean z = false;
        androidx.room.m f2 = androidx.room.m.f("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            if (b2.moveToFirst()) {
                if (b2.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.q
    public List<String> k(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.q
    public x l(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            return b2.moveToFirst() ? v.g(b2.getInt(0)) : null;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.q
    public p m(String str) {
        androidx.room.m mVar;
        p pVar;
        androidx.room.m f2 = androidx.room.m.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            int b3 = androidx.room.t.b.b(b2, "required_network_type");
            int b4 = androidx.room.t.b.b(b2, "requires_charging");
            int b5 = androidx.room.t.b.b(b2, "requires_device_idle");
            int b6 = androidx.room.t.b.b(b2, "requires_battery_not_low");
            int b7 = androidx.room.t.b.b(b2, "requires_storage_not_low");
            int b8 = androidx.room.t.b.b(b2, "trigger_content_update_delay");
            int b9 = androidx.room.t.b.b(b2, "trigger_max_content_delay");
            int b10 = androidx.room.t.b.b(b2, "content_uri_triggers");
            int b11 = androidx.room.t.b.b(b2, DeepLinkIntentReceiver.DeepLinksKeys.ID);
            int b12 = androidx.room.t.b.b(b2, "state");
            int b13 = androidx.room.t.b.b(b2, "worker_class_name");
            int b14 = androidx.room.t.b.b(b2, "input_merger_class_name");
            int b15 = androidx.room.t.b.b(b2, "input");
            int b16 = androidx.room.t.b.b(b2, "output");
            mVar = f2;
            try {
                int b17 = androidx.room.t.b.b(b2, "initial_delay");
                int b18 = androidx.room.t.b.b(b2, "interval_duration");
                int b19 = androidx.room.t.b.b(b2, "flex_duration");
                int b20 = androidx.room.t.b.b(b2, "run_attempt_count");
                int b21 = androidx.room.t.b.b(b2, "backoff_policy");
                int b22 = androidx.room.t.b.b(b2, "backoff_delay_duration");
                int b23 = androidx.room.t.b.b(b2, "period_start_time");
                int b24 = androidx.room.t.b.b(b2, "minimum_retention_duration");
                int b25 = androidx.room.t.b.b(b2, "schedule_requested_at");
                int b26 = androidx.room.t.b.b(b2, "run_in_foreground");
                int b27 = androidx.room.t.b.b(b2, "out_of_quota_policy");
                if (b2.moveToFirst()) {
                    String string = b2.getString(b11);
                    String string2 = b2.getString(b13);
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.k(v.e(b2.getInt(b3)));
                    cVar.m(b2.getInt(b4) != 0);
                    cVar.n(b2.getInt(b5) != 0);
                    cVar.l(b2.getInt(b6) != 0);
                    cVar.o(b2.getInt(b7) != 0);
                    cVar.p(b2.getLong(b8));
                    cVar.q(b2.getLong(b9));
                    cVar.j(v.b(b2.getBlob(b10)));
                    p pVar2 = new p(string, string2);
                    pVar2.f2019d = v.g(b2.getInt(b12));
                    pVar2.f2021f = b2.getString(b14);
                    pVar2.f2022g = androidx.work.e.g(b2.getBlob(b15));
                    pVar2.f2023h = androidx.work.e.g(b2.getBlob(b16));
                    pVar2.f2024i = b2.getLong(b17);
                    pVar2.f2025j = b2.getLong(b18);
                    pVar2.f2026k = b2.getLong(b19);
                    pVar2.m = b2.getInt(b20);
                    pVar2.n = v.d(b2.getInt(b21));
                    pVar2.o = b2.getLong(b22);
                    pVar2.p = b2.getLong(b23);
                    pVar2.q = b2.getLong(b24);
                    pVar2.r = b2.getLong(b25);
                    pVar2.s = b2.getInt(b26) != 0;
                    pVar2.t = v.f(b2.getInt(b27));
                    pVar2.l = cVar;
                    pVar = pVar2;
                } else {
                    pVar = null;
                }
                b2.close();
                mVar.z();
                return pVar;
            } catch (Throwable th) {
                th = th;
                b2.close();
                mVar.z();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = f2;
        }
    }

    @Override // androidx.work.impl.n.q
    public int n(String str) {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2033g.acquire();
        if (str == null) {
            acquire.a0(1);
        } else {
            acquire.m(1, str);
        }
        this.a.beginTransaction();
        try {
            int p = acquire.p();
            this.a.setTransactionSuccessful();
            return p;
        } finally {
            this.a.endTransaction();
            this.f2033g.release(acquire);
        }
    }

    @Override // androidx.work.impl.n.q
    public List<String> o(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(b2.getString(0));
            }
            return arrayList;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.q
    public List<androidx.work.e> p(String str) {
        androidx.room.m f2 = androidx.room.m.f("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            f2.a0(1);
        } else {
            f2.m(1, str);
        }
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            ArrayList arrayList = new ArrayList(b2.getCount());
            while (b2.moveToNext()) {
                arrayList.add(androidx.work.e.g(b2.getBlob(0)));
            }
            return arrayList;
        } finally {
            b2.close();
            f2.z();
        }
    }

    @Override // androidx.work.impl.n.q
    public int q(String str) {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2032f.acquire();
        if (str == null) {
            acquire.a0(1);
        } else {
            acquire.m(1, str);
        }
        this.a.beginTransaction();
        try {
            int p = acquire.p();
            this.a.setTransactionSuccessful();
            return p;
        } finally {
            this.a.endTransaction();
            this.f2032f.release(acquire);
        }
    }

    @Override // androidx.work.impl.n.q
    public void r(String str, long j2) {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2031e.acquire();
        acquire.F(1, j2);
        if (str == null) {
            acquire.a0(2);
        } else {
            acquire.m(2, str);
        }
        this.a.beginTransaction();
        try {
            acquire.p();
            this.a.setTransactionSuccessful();
        } finally {
            this.a.endTransaction();
            this.f2031e.release(acquire);
        }
    }

    @Override // androidx.work.impl.n.q
    public List<p> s(int i2) {
        androidx.room.m mVar;
        androidx.room.m f2 = androidx.room.m.f("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        f2.F(1, i2);
        this.a.assertNotSuspendingTransaction();
        Cursor b2 = androidx.room.t.c.b(this.a, f2, false, null);
        try {
            int b3 = androidx.room.t.b.b(b2, "required_network_type");
            int b4 = androidx.room.t.b.b(b2, "requires_charging");
            int b5 = androidx.room.t.b.b(b2, "requires_device_idle");
            int b6 = androidx.room.t.b.b(b2, "requires_battery_not_low");
            int b7 = androidx.room.t.b.b(b2, "requires_storage_not_low");
            int b8 = androidx.room.t.b.b(b2, "trigger_content_update_delay");
            int b9 = androidx.room.t.b.b(b2, "trigger_max_content_delay");
            int b10 = androidx.room.t.b.b(b2, "content_uri_triggers");
            int b11 = androidx.room.t.b.b(b2, DeepLinkIntentReceiver.DeepLinksKeys.ID);
            int b12 = androidx.room.t.b.b(b2, "state");
            int b13 = androidx.room.t.b.b(b2, "worker_class_name");
            int b14 = androidx.room.t.b.b(b2, "input_merger_class_name");
            int b15 = androidx.room.t.b.b(b2, "input");
            int b16 = androidx.room.t.b.b(b2, "output");
            mVar = f2;
            try {
                int b17 = androidx.room.t.b.b(b2, "initial_delay");
                int b18 = androidx.room.t.b.b(b2, "interval_duration");
                int b19 = androidx.room.t.b.b(b2, "flex_duration");
                int b20 = androidx.room.t.b.b(b2, "run_attempt_count");
                int b21 = androidx.room.t.b.b(b2, "backoff_policy");
                int b22 = androidx.room.t.b.b(b2, "backoff_delay_duration");
                int b23 = androidx.room.t.b.b(b2, "period_start_time");
                int b24 = androidx.room.t.b.b(b2, "minimum_retention_duration");
                int b25 = androidx.room.t.b.b(b2, "schedule_requested_at");
                int b26 = androidx.room.t.b.b(b2, "run_in_foreground");
                int b27 = androidx.room.t.b.b(b2, "out_of_quota_policy");
                int i3 = b16;
                ArrayList arrayList = new ArrayList(b2.getCount());
                while (b2.moveToNext()) {
                    String string = b2.getString(b11);
                    int i4 = b11;
                    String string2 = b2.getString(b13);
                    int i5 = b13;
                    androidx.work.c cVar = new androidx.work.c();
                    int i6 = b3;
                    cVar.k(v.e(b2.getInt(b3)));
                    cVar.m(b2.getInt(b4) != 0);
                    cVar.n(b2.getInt(b5) != 0);
                    cVar.l(b2.getInt(b6) != 0);
                    cVar.o(b2.getInt(b7) != 0);
                    int i7 = b4;
                    int i8 = b5;
                    cVar.p(b2.getLong(b8));
                    cVar.q(b2.getLong(b9));
                    cVar.j(v.b(b2.getBlob(b10)));
                    p pVar = new p(string, string2);
                    pVar.f2019d = v.g(b2.getInt(b12));
                    pVar.f2021f = b2.getString(b14);
                    pVar.f2022g = androidx.work.e.g(b2.getBlob(b15));
                    int i9 = i3;
                    pVar.f2023h = androidx.work.e.g(b2.getBlob(i9));
                    i3 = i9;
                    int i10 = b17;
                    pVar.f2024i = b2.getLong(i10);
                    int i11 = b14;
                    int i12 = b18;
                    pVar.f2025j = b2.getLong(i12);
                    int i13 = b6;
                    int i14 = b19;
                    pVar.f2026k = b2.getLong(i14);
                    int i15 = b20;
                    pVar.m = b2.getInt(i15);
                    int i16 = b21;
                    pVar.n = v.d(b2.getInt(i16));
                    b19 = i14;
                    int i17 = b22;
                    pVar.o = b2.getLong(i17);
                    int i18 = b23;
                    pVar.p = b2.getLong(i18);
                    b23 = i18;
                    int i19 = b24;
                    pVar.q = b2.getLong(i19);
                    int i20 = b25;
                    pVar.r = b2.getLong(i20);
                    int i21 = b26;
                    pVar.s = b2.getInt(i21) != 0;
                    int i22 = b27;
                    pVar.t = v.f(b2.getInt(i22));
                    pVar.l = cVar;
                    arrayList.add(pVar);
                    b27 = i22;
                    b4 = i7;
                    b14 = i11;
                    b17 = i10;
                    b18 = i12;
                    b20 = i15;
                    b25 = i20;
                    b11 = i4;
                    b13 = i5;
                    b3 = i6;
                    b26 = i21;
                    b24 = i19;
                    b5 = i8;
                    b22 = i17;
                    b6 = i13;
                    b21 = i16;
                }
                b2.close();
                mVar.z();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                b2.close();
                mVar.z();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            mVar = f2;
        }
    }

    @Override // androidx.work.impl.n.q
    public int t() {
        this.a.assertNotSuspendingTransaction();
        c.q.a.f acquire = this.f2035i.acquire();
        this.a.beginTransaction();
        try {
            int p = acquire.p();
            this.a.setTransactionSuccessful();
            return p;
        } finally {
            this.a.endTransaction();
            this.f2035i.release(acquire);
        }
    }
}
