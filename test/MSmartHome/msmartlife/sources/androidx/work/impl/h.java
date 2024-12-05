package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* compiled from: WorkDatabaseMigrations.java */
/* loaded from: classes.dex */
public class h {
    public static androidx.room.s.a a = new a(1, 2);

    /* renamed from: b, reason: collision with root package name */
    public static androidx.room.s.a f1925b = new b(3, 4);

    /* renamed from: c, reason: collision with root package name */
    public static androidx.room.s.a f1926c = new c(4, 5);

    /* renamed from: d, reason: collision with root package name */
    public static androidx.room.s.a f1927d = new d(6, 7);

    /* renamed from: e, reason: collision with root package name */
    public static androidx.room.s.a f1928e = new e(7, 8);

    /* renamed from: f, reason: collision with root package name */
    public static androidx.room.s.a f1929f = new f(8, 9);

    /* renamed from: g, reason: collision with root package name */
    public static androidx.room.s.a f1930g = new g(11, 12);

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class a extends androidx.room.s.a {
        a(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            bVar.l("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.l("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.l("DROP TABLE IF EXISTS alarmInfo");
            bVar.l("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class b extends androidx.room.s.a {
        b(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.l("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class c extends androidx.room.s.a {
        c(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            bVar.l("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.l("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class d extends androidx.room.s.a {
        d(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            bVar.l("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class e extends androidx.room.s.a {
        e(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class f extends androidx.room.s.a {
        f(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            bVar.l("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    class g extends androidx.room.s.a {
        g(int i2, int i3) {
            super(i2, i3);
        }

        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            bVar.l("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* renamed from: androidx.work.impl.h$h, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0038h extends androidx.room.s.a {
        final Context a;

        public C0038h(Context context, int i2, int i3) {
            super(i2, i3);
            this.a = context;
        }

        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            if (this.endVersion >= 10) {
                bVar.I("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.a.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations.java */
    /* loaded from: classes.dex */
    public static class i extends androidx.room.s.a {
        final Context a;

        public i(Context context) {
            super(9, 10);
            this.a = context;
        }

        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            bVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            androidx.work.impl.utils.e.b(this.a, bVar);
            androidx.work.impl.utils.c.a(this.a, bVar);
        }
    }
}
