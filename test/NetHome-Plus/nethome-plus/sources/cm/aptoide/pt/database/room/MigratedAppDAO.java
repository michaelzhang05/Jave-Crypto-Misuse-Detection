package cm.aptoide.pt.database.room;

import h.a.m;

/* loaded from: classes.dex */
public interface MigratedAppDAO {
    m<Integer> isAppMigrated(String str);

    void save(RoomMigratedApp roomMigratedApp);
}
