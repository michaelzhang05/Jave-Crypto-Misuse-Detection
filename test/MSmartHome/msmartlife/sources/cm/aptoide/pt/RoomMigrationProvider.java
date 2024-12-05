package cm.aptoide.pt;

import kotlin.Metadata;
import okhttp3.HttpUrl;

/* compiled from: RoomMigrationProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcm/aptoide/pt/RoomMigrationProvider;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "migrations", HttpUrl.FRAGMENT_ENCODE_SET, "Landroidx/room/migration/Migration;", "getMigrations", "()[Landroidx/room/migration/Migration;", "[Landroidx/room/migration/Migration;", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoomMigrationProvider {
    private final androidx.room.s.a[] migrations = {new androidx.room.s.a() { // from class: cm.aptoide.pt.RoomMigrationProvider$migrations$1
        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "database");
            bVar.l("ALTER TABLE download ADD COLUMN attributionId TEXT");
        }
    }, new androidx.room.s.a() { // from class: cm.aptoide.pt.RoomMigrationProvider$migrations$2
        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "database");
            bVar.l("ALTER TABLE installed ADD COLUMN enabled INTEGER DEFAULT 1 NOT NULL");
        }
    }, new androidx.room.s.a() { // from class: cm.aptoide.pt.RoomMigrationProvider$migrations$3
        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "database");
            bVar.l("DELETE FROM `update` WHERE appcUpgrade=1");
            bVar.l("CREATE TABLE IF NOT EXISTS update_tmp (`packageName` TEXT NOT NULL, `appId` INTEGER NOT NULL, `label` TEXT, `icon` TEXT, `md5` TEXT, `apkPath` TEXT, `size` INTEGER NOT NULL, `updateVersionName` TEXT, `updateVersionCode` INTEGER NOT NULL, `excluded` INTEGER NOT NULL, `trustedBadge` TEXT, `alternativeApkPath` TEXT, `storeName` TEXT, `mainObbName` TEXT, `mainObbPath` TEXT, `mainObbMd5` TEXT, `patchObbName` TEXT, `patchObbPath` TEXT, `patchObbMd5` TEXT, `roomSplits` TEXT, `requiredSplits` TEXT, `hasAppc` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
            bVar.l("INSERT INTO update_tmp (packageName, appId, label, icon, md5, apkPath, size, updateVersionName, updateVersionCode, excluded, trustedBadge, alternativeApkPath, storeName, mainObbName, mainObbPath, mainObbMd5, patchObbName, patchObbPath, patchObbMd5, roomSplits, requiredSplits, hasAppc) SELECT packageName, appId, label, icon, md5, apkPath, size, updateVersionName, updateVersionCode, excluded, trustedBadge, alternativeApkPath, storeName, mainObbName, mainObbPath, mainObbMd5, patchObbName, patchObbPath, patchObbMd5, roomSplits, requiredSplits, hasAppc FROM `update`");
            bVar.l("DROP TABLE `update`");
            bVar.l("ALTER TABLE update_tmp RENAME TO `update`");
        }
    }, new androidx.room.s.a() { // from class: cm.aptoide.pt.RoomMigrationProvider$migrations$4
        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "database");
            bVar.l("ALTER TABLE installed ADD COLUMN `appSize` INTEGER DEFAULT 1 NOT NULL");
        }
    }, new androidx.room.s.a() { // from class: cm.aptoide.pt.RoomMigrationProvider$migrations$5
        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "database");
            bVar.l("UPDATE download SET icon='' WHERE icon IS NULL");
        }
    }, new androidx.room.s.a() { // from class: cm.aptoide.pt.RoomMigrationProvider$migrations$6
        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "database");
            bVar.l("ALTER TABLE notification ADD COLUMN whitelistedPackages TEXT");
        }
    }, new androidx.room.s.a() { // from class: cm.aptoide.pt.RoomMigrationProvider$migrations$7
        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "database");
            bVar.l("CREATE TABLE IF NOT EXISTS appComingSoonRegistration (`packageName`TEXT NOT NULL, PRIMARY KEY(`packageName`) )");
        }
    }, new androidx.room.s.a() { // from class: cm.aptoide.pt.RoomMigrationProvider$migrations$8
        @Override // androidx.room.s.a
        public void migrate(c.q.a.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "database");
            bVar.l("ALTER TABLE `update` ADD COLUMN downloadCampaigns TEXT");
        }
    }};

    public final androidx.room.s.a[] getMigrations() {
        return this.migrations;
    }
}
