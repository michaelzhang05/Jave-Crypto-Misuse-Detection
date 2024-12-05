package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzazr {

    /* renamed from: b, reason: collision with root package name */
    private static List<MediaCodecInfo> f13130b;
    private static Map<String, List<Map<String, Object>>> a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f13131c = new Object();

    @TargetApi(21)
    private static Integer[] a(Range<Integer> range) {
        return new Integer[]{range.getLower(), range.getUpper()};
    }

    @TargetApi(16)
    public static List<Map<String, Object>> b(String str) {
        ArrayList arrayList;
        Object obj = f13131c;
        synchronized (obj) {
            if (a.containsKey(str)) {
                return a.get(str);
            }
            try {
                synchronized (obj) {
                    if (f13130b == null) {
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 21) {
                            f13130b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                        } else if (i2 >= 16) {
                            int codecCount = MediaCodecList.getCodecCount();
                            f13130b = new ArrayList(codecCount);
                            for (int i3 = 0; i3 < codecCount; i3++) {
                                f13130b.add(MediaCodecList.getCodecInfoAt(i3));
                            }
                        } else {
                            f13130b = Collections.emptyList();
                        }
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f13130b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap.put("profileLevels", arrayList2);
                            int i4 = Build.VERSION.SDK_INT;
                            if (i4 >= 21) {
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                hashMap.put("bitRatesBps", a(videoCapabilities.getBitrateRange()));
                                hashMap.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                                hashMap.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                                hashMap.put("frameRates", a(videoCapabilities.getSupportedFrameRates()));
                                hashMap.put("widths", a(videoCapabilities.getSupportedWidths()));
                                hashMap.put("heights", a(videoCapabilities.getSupportedHeights()));
                            }
                            if (i4 >= 23) {
                                hashMap.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            }
                            arrayList.add(hashMap);
                        }
                    }
                    a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e2) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("error", e2.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap2);
                a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }
}
