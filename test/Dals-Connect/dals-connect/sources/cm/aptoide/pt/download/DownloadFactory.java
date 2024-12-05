package cm.aptoide.pt.download;

import cm.aptoide.pt.aab.DynamicSplit;
import cm.aptoide.pt.aab.Split;
import cm.aptoide.pt.database.room.RoomDownload;
import cm.aptoide.pt.database.room.RoomFileToDownload;
import cm.aptoide.pt.database.room.RoomSplit;
import cm.aptoide.pt.database.room.RoomUpdate;
import cm.aptoide.pt.dataprovider.model.v7.Obb;
import cm.aptoide.pt.download.AppValidator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class DownloadFactory {
    private final AppValidator appValidator;
    private final String cachePath;
    private final String marketName;
    private final SplitTypeSubFileTypeMapper splitTypeSubFileTypeMapper;

    public DownloadFactory(String str, String str2, AppValidator appValidator, SplitTypeSubFileTypeMapper splitTypeSubFileTypeMapper) {
        this.marketName = str;
        this.cachePath = str2;
        this.appValidator = appValidator;
        this.splitTypeSubFileTypeMapper = splitTypeSubFileTypeMapper;
    }

    private long calculateAppSize(long j2, List<DynamicSplit> list) {
        long j3 = 0;
        for (DynamicSplit dynamicSplit : list) {
            if (dynamicSplit.getDeliveryTypes().contains("INSTALL_TIME")) {
                j3 += dynamicSplit.getFileSize();
                Iterator<Split> it = dynamicSplit.getConfigSplits().iterator();
                while (it.hasNext()) {
                    j3 += it.next().getFilesize();
                }
            }
        }
        return j3 + j2;
    }

    private List<RoomFileToDownload> createFileList(String str, String str2, String str3, String str4, Obb obb, String str5, int i2, String str6, List<Split> list, List<DynamicSplit> list2) {
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        if (obb != null) {
            Obb.ObbItem main = obb.getMain();
            if (main != null) {
                str14 = main.getPath();
                str15 = main.getMd5sum();
                str13 = main.getFilename();
            } else {
                str13 = null;
                str14 = null;
                str15 = null;
            }
            Obb.ObbItem patch = obb.getPatch();
            if (patch != null) {
                String path = patch.getPath();
                String md5sum = patch.getMd5sum();
                str9 = path;
                str11 = str13;
                str7 = str14;
                str8 = str15;
                str12 = patch.getFilename();
                str10 = md5sum;
            } else {
                str9 = null;
                str10 = null;
                str12 = null;
                str11 = str13;
                str7 = str14;
                str8 = str15;
            }
        } else {
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            str12 = null;
        }
        return createFileList(str, str2, str3, str5, str4, str7, str8, str9, str10, i2, str6, str11, str12, list, list2);
    }

    private List<Split> map(List<RoomSplit> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (RoomSplit roomSplit : list) {
            arrayList.add(new Split(roomSplit.getName(), roomSplit.getType(), roomSplit.getPath(), roomSplit.getFileSize(), roomSplit.getMd5()));
        }
        return arrayList;
    }

    public RoomDownload create(RoomUpdate roomUpdate, boolean z, List<DynamicSplit> list) {
        AppValidator.AppValidationResult validateApp = this.appValidator.validateApp(roomUpdate.getMd5(), null, roomUpdate.getPackageName(), roomUpdate.getLabel(), roomUpdate.getApkPath(), roomUpdate.getAlternativeApkPath(), map(roomUpdate.getRoomSplits()), roomUpdate.getRequiredSplits());
        if (validateApp == AppValidator.AppValidationResult.VALID_APP) {
            RoomDownload roomDownload = new RoomDownload();
            roomDownload.setMd5(roomUpdate.getMd5());
            roomDownload.setIcon(roomUpdate.getIcon());
            roomDownload.setAppName(roomUpdate.getLabel());
            roomDownload.setAction(z ? 2 : 1);
            roomDownload.setPackageName(roomUpdate.getPackageName());
            roomDownload.setVersionCode(roomUpdate.getUpdateVersionCode());
            roomDownload.setVersionName(roomUpdate.getUpdateVersionName());
            roomDownload.setHasAppc(roomUpdate.hasAppc());
            roomDownload.setTrustedBadge(roomUpdate.getTrustedBadge());
            roomDownload.setStoreName(roomUpdate.getStoreName());
            roomDownload.setFilesToDownload(createFileList(roomUpdate.getMd5(), roomUpdate.getPackageName(), roomUpdate.getApkPath(), roomUpdate.getAlternativeApkPath(), roomUpdate.getMd5(), roomUpdate.getMainObbPath(), roomUpdate.getMainObbMd5(), roomUpdate.getPatchObbPath(), roomUpdate.getPatchObbMd5(), roomUpdate.getUpdateVersionCode(), roomUpdate.getUpdateVersionName(), roomUpdate.getMainObbName(), roomUpdate.getPatchObbName(), map(roomUpdate.getRoomSplits()), list));
            roomDownload.setSize(calculateAppSize(roomUpdate.getSize(), list));
            return roomDownload;
        }
        throw new InvalidAppException(validateApp.getMessage());
    }

    private List<RoomFileToDownload> createFileList(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, String str10, String str11, String str12, List<Split> list, List<DynamicSplit> list2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RoomFileToDownload.createFileToDownload(str3, str4, str, str5, 0, str2, i2, str10, this.cachePath, 15));
        if (str6 != null) {
            arrayList.add(RoomFileToDownload.createFileToDownload(str6, null, str7, str11, 1, str2, i2, str10, this.cachePath, 13));
        }
        if (str8 != null) {
            arrayList.add(RoomFileToDownload.createFileToDownload(str8, null, str9, str12, 1, str2, i2, str10, this.cachePath, 14));
        }
        if (list != null) {
            for (Split split : list) {
                arrayList.add(RoomFileToDownload.createFileToDownload(split.getPath(), null, split.getMd5sum(), split.getMd5sum() + "." + split.getName(), 3, str2, i2, str10, this.cachePath, 10));
            }
        }
        if (list2 != null) {
            for (DynamicSplit dynamicSplit : list2) {
                if (dynamicSplit.getDeliveryTypes().contains("INSTALL_TIME")) {
                    int mapSplitToSubFileType = this.splitTypeSubFileTypeMapper.mapSplitToSubFileType(dynamicSplit.getType());
                    arrayList.add(RoomFileToDownload.createFileToDownload(dynamicSplit.getPath(), null, dynamicSplit.getMd5Sum(), dynamicSplit.getMd5Sum() + "." + dynamicSplit.getName(), 3, str2, i2, str10, this.cachePath, mapSplitToSubFileType));
                    for (Split split2 : dynamicSplit.getConfigSplits()) {
                        arrayList.add(RoomFileToDownload.createFileToDownload(split2.getPath(), null, split2.getMd5sum(), split2.getMd5sum() + "." + split2.getName(), 3, str2, i2, str10, this.cachePath, mapSplitToSubFileType));
                    }
                }
            }
        }
        return arrayList;
    }

    public RoomDownload create(String str, int i2, String str2, String str3, boolean z) {
        RoomDownload roomDownload = new RoomDownload();
        roomDownload.setAppName(this.marketName);
        roomDownload.setMd5(str);
        roomDownload.setVersionCode(i2);
        roomDownload.setPackageName(str2);
        roomDownload.setVersionName("Auto-Update");
        roomDownload.setIcon(HttpUrl.FRAGMENT_ENCODE_SET);
        roomDownload.setAction(1);
        roomDownload.setHasAppc(z);
        roomDownload.setSize(0L);
        roomDownload.setFilesToDownload(createFileList(str, str2, str3, str, null, str3, i2, "Auto-Update", null, null));
        return roomDownload;
    }

    public RoomDownload create(int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, String str7, Obb obb, boolean z, long j2, List<Split> list, List<String> list2, String str8, String str9, List<DynamicSplit> list3) {
        return create(i2, str, str2, str3, str4, str5, i3, str6, str7, obb, z, j2, list, list2, str8, str9, null, list3);
    }

    public RoomDownload create(int i2, String str, String str2, String str3, String str4, String str5, int i3, String str6, String str7, Obb obb, boolean z, long j2, List<Split> list, List<String> list2, String str8, String str9, String str10, List<DynamicSplit> list3) {
        AppValidator.AppValidationResult validateApp = this.appValidator.validateApp(str3, obb, str2, str, str6, str7, list, list2);
        if (validateApp == AppValidator.AppValidationResult.VALID_APP) {
            long calculateAppSize = calculateAppSize(j2, list3);
            RoomDownload roomDownload = new RoomDownload();
            roomDownload.setMd5(str3);
            roomDownload.setIcon(str4);
            roomDownload.setAppName(str);
            roomDownload.setAction(i2);
            roomDownload.setPackageName(str2);
            roomDownload.setHasAppc(z);
            roomDownload.setVersionCode(i3);
            roomDownload.setVersionName(str5);
            roomDownload.setSize(calculateAppSize);
            roomDownload.setTrustedBadge(str8);
            roomDownload.setStoreName(str9);
            roomDownload.setAttributionId(str10);
            roomDownload.setFilesToDownload(createFileList(str3, str2, str6, str3, obb, str7, i3, str5, list, list3));
            return roomDownload;
        }
        throw new InvalidAppException(validateApp.getMessage());
    }
}
