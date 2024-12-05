package androidx.work.impl;

import android.os.Build;
import androidx.room.j;
import androidx.room.l;
import androidx.room.t.g;
import androidx.work.impl.n.n;
import androidx.work.impl.n.o;
import androidx.work.impl.n.q;
import androidx.work.impl.n.r;
import androidx.work.impl.n.t;
import androidx.work.impl.n.u;
import c.q.a.c;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.database.room.RoomNotification;
import cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: b, reason: collision with root package name */
    private volatile q f1832b;

    /* renamed from: c, reason: collision with root package name */
    private volatile androidx.work.impl.n.b f1833c;

    /* renamed from: d, reason: collision with root package name */
    private volatile t f1834d;

    /* renamed from: e, reason: collision with root package name */
    private volatile androidx.work.impl.n.h f1835e;

    /* renamed from: f, reason: collision with root package name */
    private volatile androidx.work.impl.n.k f1836f;

    /* renamed from: g, reason: collision with root package name */
    private volatile n f1837g;

    /* renamed from: h, reason: collision with root package name */
    private volatile androidx.work.impl.n.e f1838h;

    /* loaded from: classes.dex */
    class a extends l.a {
        a(int i2) {
            super(i2);
        }

        @Override // androidx.room.l.a
        public void createAllTables(c.q.a.b bVar) {
            bVar.l("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.l("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.l("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.l("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.l("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.l("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // androidx.room.l.a
        public void dropAllTables(c.q.a.b bVar) {
            bVar.l("DROP TABLE IF EXISTS `Dependency`");
            bVar.l("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.l("DROP TABLE IF EXISTS `WorkTag`");
            bVar.l("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.l("DROP TABLE IF EXISTS `WorkName`");
            bVar.l("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.l("DROP TABLE IF EXISTS `Preference`");
            if (((androidx.room.j) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((androidx.room.j) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((j.b) ((androidx.room.j) WorkDatabase_Impl.this).mCallbacks.get(i2)).b(bVar);
                }
            }
        }

        @Override // androidx.room.l.a
        protected void onCreate(c.q.a.b bVar) {
            if (((androidx.room.j) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((androidx.room.j) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((j.b) ((androidx.room.j) WorkDatabase_Impl.this).mCallbacks.get(i2)).a(bVar);
                }
            }
        }

        @Override // androidx.room.l.a
        public void onOpen(c.q.a.b bVar) {
            ((androidx.room.j) WorkDatabase_Impl.this).mDatabase = bVar;
            bVar.l("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(bVar);
            if (((androidx.room.j) WorkDatabase_Impl.this).mCallbacks != null) {
                int size = ((androidx.room.j) WorkDatabase_Impl.this).mCallbacks.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((j.b) ((androidx.room.j) WorkDatabase_Impl.this).mCallbacks.get(i2)).c(bVar);
                }
            }
        }

        @Override // androidx.room.l.a
        public void onPostMigrate(c.q.a.b bVar) {
        }

        @Override // androidx.room.l.a
        public void onPreMigrate(c.q.a.b bVar) {
            androidx.room.t.c.a(bVar);
        }

        @Override // androidx.room.l.a
        protected l.b onValidateSchema(c.q.a.b bVar) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap.put("prerequisite_id", new g.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.ID)));
            hashSet.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.ID)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new g.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new g.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            androidx.room.t.g gVar = new androidx.room.t.g("Dependency", hashMap, hashSet, hashSet2);
            androidx.room.t.g a = androidx.room.t.g.a(bVar, "Dependency");
            if (!gVar.equals(a)) {
                return new l.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + gVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put(DeepLinkIntentReceiver.DeepLinksKeys.ID, new g.a(DeepLinkIntentReceiver.DeepLinksKeys.ID, "TEXT", true, 1, null, 1));
            hashMap2.put("state", new g.a("state", "INTEGER", true, 0, null, 1));
            hashMap2.put("worker_class_name", new g.a("worker_class_name", "TEXT", true, 0, null, 1));
            hashMap2.put("input_merger_class_name", new g.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            hashMap2.put("input", new g.a("input", "BLOB", true, 0, null, 1));
            hashMap2.put("output", new g.a("output", "BLOB", true, 0, null, 1));
            hashMap2.put("initial_delay", new g.a("initial_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("interval_duration", new g.a("interval_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("flex_duration", new g.a("flex_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_attempt_count", new g.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_policy", new g.a("backoff_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("backoff_delay_duration", new g.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("period_start_time", new g.a("period_start_time", "INTEGER", true, 0, null, 1));
            hashMap2.put("minimum_retention_duration", new g.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            hashMap2.put("schedule_requested_at", new g.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            hashMap2.put("run_in_foreground", new g.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            hashMap2.put("out_of_quota_policy", new g.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            hashMap2.put("required_network_type", new g.a("required_network_type", "INTEGER", false, 0, null, 1));
            hashMap2.put("requires_charging", new g.a("requires_charging", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_device_idle", new g.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_battery_not_low", new g.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("requires_storage_not_low", new g.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_content_update_delay", new g.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("trigger_max_content_delay", new g.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            hashMap2.put("content_uri_triggers", new g.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new g.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new g.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            androidx.room.t.g gVar2 = new androidx.room.t.g("WorkSpec", hashMap2, hashSet3, hashSet4);
            androidx.room.t.g a2 = androidx.room.t.g.a(bVar, "WorkSpec");
            if (!gVar2.equals(a2)) {
                return new l.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + gVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put(StoreTabGridRecyclerFragment.BundleCons.TAG, new g.a(StoreTabGridRecyclerFragment.BundleCons.TAG, "TEXT", true, 1, null, 1));
            hashMap3.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.ID)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new g.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            androidx.room.t.g gVar3 = new androidx.room.t.g("WorkTag", hashMap3, hashSet5, hashSet6);
            androidx.room.t.g a3 = androidx.room.t.g.a(bVar, "WorkTag");
            if (!gVar3.equals(a3)) {
                return new l.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + gVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap4.put("system_id", new g.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.ID)));
            androidx.room.t.g gVar4 = new androidx.room.t.g("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            androidx.room.t.g a4 = androidx.room.t.g.a(bVar, "SystemIdInfo");
            if (!gVar4.equals(a4)) {
                return new l.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + gVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new g.a("name", "TEXT", true, 1, null, 1));
            hashMap5.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.ID)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new g.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            androidx.room.t.g gVar5 = new androidx.room.t.g("WorkName", hashMap5, hashSet8, hashSet9);
            androidx.room.t.g a5 = androidx.room.t.g.a(bVar, "WorkName");
            if (!gVar5.equals(a5)) {
                return new l.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + gVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new g.a("work_spec_id", "TEXT", true, 1, null, 1));
            hashMap6.put("progress", new g.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new g.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(DeepLinkIntentReceiver.DeepLinksKeys.ID)));
            androidx.room.t.g gVar6 = new androidx.room.t.g("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            androidx.room.t.g a6 = androidx.room.t.g.a(bVar, "WorkProgress");
            if (!gVar6.equals(a6)) {
                return new l.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + gVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put(RoomNotification.KEY, new g.a(RoomNotification.KEY, "TEXT", true, 1, null, 1));
            hashMap7.put("long_value", new g.a("long_value", "INTEGER", false, 0, null, 1));
            androidx.room.t.g gVar7 = new androidx.room.t.g("Preference", hashMap7, new HashSet(0), new HashSet(0));
            androidx.room.t.g a7 = androidx.room.t.g.a(bVar, "Preference");
            if (!gVar7.equals(a7)) {
                return new l.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + gVar7 + "\n Found:\n" + a7);
            }
            return new l.b(true, null);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.n.b b() {
        androidx.work.impl.n.b bVar;
        if (this.f1833c != null) {
            return this.f1833c;
        }
        synchronized (this) {
            if (this.f1833c == null) {
                this.f1833c = new androidx.work.impl.n.c(this);
            }
            bVar = this.f1833c;
        }
        return bVar;
    }

    @Override // androidx.room.j
    public void clearAllTables() {
        super.assertNotMainThread();
        c.q.a.b N = super.getOpenHelper().N();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                N.l("PRAGMA foreign_keys = FALSE");
            } finally {
                super.endTransaction();
                if (!z) {
                    N.l("PRAGMA foreign_keys = TRUE");
                }
                N.O("PRAGMA wal_checkpoint(FULL)").close();
                if (!N.e0()) {
                    N.l("VACUUM");
                }
            }
        }
        super.beginTransaction();
        if (z) {
            N.l("PRAGMA defer_foreign_keys = TRUE");
        }
        N.l("DELETE FROM `Dependency`");
        N.l("DELETE FROM `WorkSpec`");
        N.l("DELETE FROM `WorkTag`");
        N.l("DELETE FROM `SystemIdInfo`");
        N.l("DELETE FROM `WorkName`");
        N.l("DELETE FROM `WorkProgress`");
        N.l("DELETE FROM `Preference`");
        super.setTransactionSuccessful();
    }

    @Override // androidx.room.j
    protected androidx.room.g createInvalidationTracker() {
        return new androidx.room.g(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.j
    protected c.q.a.c createOpenHelper(androidx.room.a aVar) {
        return aVar.a.a(c.b.a(aVar.f1611b).c(aVar.f1612c).b(new l(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.n.e f() {
        androidx.work.impl.n.e eVar;
        if (this.f1838h != null) {
            return this.f1838h;
        }
        synchronized (this) {
            if (this.f1838h == null) {
                this.f1838h = new androidx.work.impl.n.f(this);
            }
            eVar = this.f1838h;
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.n.h g() {
        androidx.work.impl.n.h hVar;
        if (this.f1835e != null) {
            return this.f1835e;
        }
        synchronized (this) {
            if (this.f1835e == null) {
                this.f1835e = new androidx.work.impl.n.i(this);
            }
            hVar = this.f1835e;
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public androidx.work.impl.n.k h() {
        androidx.work.impl.n.k kVar;
        if (this.f1836f != null) {
            return this.f1836f;
        }
        synchronized (this) {
            if (this.f1836f == null) {
                this.f1836f = new androidx.work.impl.n.l(this);
            }
            kVar = this.f1836f;
        }
        return kVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public n i() {
        n nVar;
        if (this.f1837g != null) {
            return this.f1837g;
        }
        synchronized (this) {
            if (this.f1837g == null) {
                this.f1837g = new o(this);
            }
            nVar = this.f1837g;
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q j() {
        q qVar;
        if (this.f1832b != null) {
            return this.f1832b;
        }
        synchronized (this) {
            if (this.f1832b == null) {
                this.f1832b = new r(this);
            }
            qVar = this.f1832b;
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t k() {
        t tVar;
        if (this.f1834d != null) {
            return this.f1834d;
        }
        synchronized (this) {
            if (this.f1834d == null) {
                this.f1834d = new u(this);
            }
            tVar = this.f1834d;
        }
        return tVar;
    }
}
