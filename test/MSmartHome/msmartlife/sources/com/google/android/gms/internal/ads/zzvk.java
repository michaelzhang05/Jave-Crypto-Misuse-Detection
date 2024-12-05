package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzvk {
    private final zzva a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15674b;

    /* renamed from: c, reason: collision with root package name */
    private String f15675c;

    /* renamed from: d, reason: collision with root package name */
    private String f15676d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15677e = false;

    /* renamed from: f, reason: collision with root package name */
    private final int f15678f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15679g;

    public zzvk(int i2, int i3, int i4) {
        this.f15674b = i2;
        if (i3 <= 64 && i3 >= 0) {
            this.f15678f = i3;
        } else {
            this.f15678f = 64;
        }
        if (i4 <= 0) {
            this.f15679g = 1;
        } else {
            this.f15679g = i4;
        }
        this.a = new zzvj(this.f15678f);
    }

    public final String a(ArrayList<String> arrayList, ArrayList<zzuz> arrayList2) {
        boolean z;
        boolean z2;
        int i2;
        Collections.sort(arrayList2, new zzvl(this));
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            String[] split = Normalizer.normalize(arrayList.get(arrayList2.get(i3).e()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
            if (split.length != 0) {
                for (String str : split) {
                    if (str.indexOf("'") != -1) {
                        StringBuilder sb = new StringBuilder(str);
                        int i4 = 1;
                        boolean z3 = false;
                        while (true) {
                            int i5 = i4 + 2;
                            if (i5 > sb.length()) {
                                break;
                            }
                            if (sb.charAt(i4) == '\'') {
                                if (sb.charAt(i4 - 1) != ' ') {
                                    int i6 = i4 + 1;
                                    if ((sb.charAt(i6) == 's' || sb.charAt(i6) == 'S') && (i5 == sb.length() || sb.charAt(i5) == ' ')) {
                                        sb.insert(i4, ' ');
                                        i4 = i5;
                                        i2 = 1;
                                        z3 = true;
                                    }
                                }
                                sb.setCharAt(i4, ' ');
                                i2 = 1;
                                z3 = true;
                            } else {
                                i2 = 1;
                            }
                            i4 += i2;
                        }
                        String sb2 = z3 ? sb.toString() : null;
                        if (sb2 != null) {
                            this.f15676d = sb2;
                            str = sb2;
                        }
                    }
                    String[] b2 = zzve.b(str, true);
                    if (b2.length >= this.f15679g) {
                        for (int i7 = 0; i7 < b2.length; i7++) {
                            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            int i8 = 0;
                            while (true) {
                                if (i8 >= this.f15679g) {
                                    z2 = true;
                                    break;
                                }
                                int i9 = i7 + i8;
                                if (i9 >= b2.length) {
                                    z2 = false;
                                    break;
                                }
                                if (i8 > 0) {
                                    str2 = String.valueOf(str2).concat(" ");
                                }
                                String valueOf = String.valueOf(str2);
                                String valueOf2 = String.valueOf(b2[i9]);
                                str2 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                                i8++;
                            }
                            if (!z2) {
                                break;
                            }
                            hashSet.add(str2);
                            if (hashSet.size() >= this.f15674b) {
                                break;
                            }
                        }
                        if (hashSet.size() >= this.f15674b) {
                            z = false;
                            break;
                        }
                    }
                }
            }
            z = true;
            if (!z) {
                break;
            }
        }
        u40 u40Var = new u40();
        this.f15675c = HttpUrl.FRAGMENT_ENCODE_SET;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                u40Var.a(this.a.a((String) it.next()));
            } catch (IOException e2) {
                zzbad.c("Error while writing hash to byteStream", e2);
            }
        }
        return u40Var.toString();
    }
}
