package cm.aptoide.pt.updates;

import cm.aptoide.pt.database.room.RoomCampaignUrl;
import cm.aptoide.pt.database.room.RoomSplit;
import cm.aptoide.pt.database.room.RoomUpdate;
import cm.aptoide.pt.dataprovider.model.v7.Obb;
import cm.aptoide.pt.dataprovider.model.v7.Split;
import cm.aptoide.pt.dataprovider.model.v7.listapp.App;
import cm.aptoide.pt.dataprovider.model.v7.listapp.Urls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.t;
import okhttp3.HttpUrl;

/* compiled from: UpdateMapper.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bJ\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bH\u0002J \u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\b2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\bH\u0002¨\u0006\u0015"}, d2 = {"Lcm/aptoide/pt/updates/UpdateMapper;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "mapAppUpdate", "Lcm/aptoide/pt/database/room/RoomUpdate;", "app", "Lcm/aptoide/pt/dataprovider/model/v7/listapp/App;", "mapAppUpdateList", HttpUrl.FRAGMENT_ENCODE_SET, "appList", "mapDownloadCampaign", "Lcm/aptoide/pt/database/room/RoomCampaignUrl;", "urls", "Lcm/aptoide/pt/dataprovider/model/v7/listapp/Urls;", "mapRequiredSplits", HttpUrl.FRAGMENT_ENCODE_SET, "requiredSplits", "mapSplits", "Lcm/aptoide/pt/database/room/RoomSplit;", "splits", "Lcm/aptoide/pt/dataprovider/model/v7/Split;", "app_vanillaProdRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UpdateMapper {
    private final RoomUpdate mapAppUpdate(App app) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        Obb obb = app.getObb();
        if (obb != null) {
            Obb.ObbItem main = obb.getMain();
            Obb.ObbItem patch = obb.getPatch();
            if (main != null) {
                str8 = main.getFilename();
                str9 = main.getPath();
                str7 = main.getMd5sum();
            } else {
                str7 = null;
                str8 = null;
                str9 = null;
            }
            if (patch != null) {
                String filename = patch.getFilename();
                String path = patch.getPath();
                str6 = patch.getMd5sum();
                str4 = filename;
                str3 = str7;
                str = str8;
                str2 = str9;
                str5 = path;
            } else {
                str4 = null;
                str5 = null;
                str6 = null;
                str3 = str7;
                str = str8;
                str2 = str9;
            }
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        return new RoomUpdate(app.getId(), app.getName(), app.getIcon(), app.getPackageName(), app.getFile().getMd5sum(), app.getFile().getPath(), app.getSize(), app.getFile().getVername(), app.getFile().getPathAlt(), app.getFile().getVercode(), app.getFile().getMalware().getRank().name(), str, str2, str3, str4, str5, str6, app.hasAdvertising() || app.hasBilling(), mapSplits(app.hasSplits() ? app.getAab().getSplits() : t.i()), mapRequiredSplits(app.hasSplits() ? app.getAab().getRequiredSplits() : t.i()), app.getStore().getName(), mapDownloadCampaign(app.getUrls()));
    }

    private final List<RoomCampaignUrl> mapDownloadCampaign(Urls urls) {
        ArrayList arrayList = new ArrayList();
        if (urls != null && urls.getDownload() != null) {
            for (Urls.Url url : urls.getDownload()) {
                arrayList.add(new RoomCampaignUrl(url.getName(), url.getUrl()));
            }
        }
        return arrayList;
    }

    private final List<String> mapRequiredSplits(List<String> requiredSplits) {
        ArrayList arrayList = new ArrayList();
        if (requiredSplits == null) {
            return arrayList;
        }
        Iterator<String> it = requiredSplits.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    private final List<RoomSplit> mapSplits(List<? extends Split> splits) {
        ArrayList arrayList = new ArrayList();
        if (splits == null) {
            return arrayList;
        }
        for (Split split : splits) {
            arrayList.add(new RoomSplit(split.getMd5sum(), split.getPath(), split.getType(), split.getName(), split.getFilesize()));
        }
        return arrayList;
    }

    public final List<RoomUpdate> mapAppUpdateList(List<? extends App> appList) {
        kotlin.jvm.internal.l.f(appList, "appList");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends App> it = appList.iterator();
        while (it.hasNext()) {
            arrayList.add(mapAppUpdate(it.next()));
        }
        return arrayList;
    }
}
