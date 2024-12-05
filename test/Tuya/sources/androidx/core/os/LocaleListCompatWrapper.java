package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class LocaleListCompatWrapper implements LocaleListInterface {
    private final Locale[] mList;

    @NonNull
    private final String mStringRepresentation;
    private static final Locale[] sEmptyList = new Locale[0];
    private static final Locale LOCALE_EN_XA = new Locale("en", "XA");
    private static final Locale LOCALE_AR_XB = new Locale("ar", "XB");
    private static final Locale EN_LATN = LocaleListCompat.forLanguageTagCompat("en-Latn");

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* loaded from: classes3.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static String getScript(Locale locale) {
            return locale.getScript();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocaleListCompatWrapper(@NonNull Locale... localeArr) {
        if (localeArr.length == 0) {
            this.mList = sEmptyList;
            this.mStringRepresentation = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < localeArr.length; i8++) {
            Locale locale = localeArr[i8];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    toLanguageTag(sb, locale2);
                    if (i8 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i8 + "] is null");
            }
        }
        this.mList = (Locale[]) arrayList.toArray(new Locale[0]);
        this.mStringRepresentation = sb.toString();
    }

    private Locale computeFirstMatch(Collection<String> collection, boolean z8) {
        int computeFirstMatchIndex = computeFirstMatchIndex(collection, z8);
        if (computeFirstMatchIndex == -1) {
            return null;
        }
        return this.mList[computeFirstMatchIndex];
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        if (r6 < Integer.MAX_VALUE) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> r5, boolean r6) {
        /*
            r4 = this;
            java.util.Locale[] r0 = r4.mList
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = androidx.core.os.LocaleListCompatWrapper.EN_LATN
            int r6 = r4.findFirstMatchIndex(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L21
        L1e:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L21:
            java.util.Iterator r5 = r5.iterator()
        L25:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.os.LocaleListCompat.forLanguageTagCompat(r1)
            int r1 = r4.findFirstMatchIndex(r1)
            if (r1 != 0) goto L3c
            return r3
        L3c:
            if (r1 >= r6) goto L25
            r6 = r1
            goto L25
        L40:
            if (r6 != r0) goto L43
            return r3
        L43:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.os.LocaleListCompatWrapper.computeFirstMatchIndex(java.util.Collection, boolean):int");
    }

    private int findFirstMatchIndex(Locale locale) {
        int i8 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i8 < localeArr.length) {
                if (matchScore(locale, localeArr[i8]) > 0) {
                    return i8;
                }
                i8++;
            } else {
                return Integer.MAX_VALUE;
            }
        }
    }

    private static String getLikelyScript(Locale locale) {
        String script = Api21Impl.getScript(locale);
        if (!script.isEmpty()) {
            return script;
        }
        return "";
    }

    private static boolean isPseudoLocale(Locale locale) {
        if (!LOCALE_EN_XA.equals(locale) && !LOCALE_AR_XB.equals(locale)) {
            return false;
        }
        return true;
    }

    @IntRange(from = FabTransformationScrimBehavior.COLLAPSE_DELAY, to = 1)
    private static int matchScore(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return 1;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || isPseudoLocale(locale) || isPseudoLocale(locale2)) {
            return 0;
        }
        String likelyScript = getLikelyScript(locale);
        if (!likelyScript.isEmpty()) {
            return likelyScript.equals(getLikelyScript(locale2)) ? 1 : 0;
        }
        String country = locale.getCountry();
        if (country.isEmpty() || country.equals(locale2.getCountry())) {
            return 1;
        }
        return 0;
    }

    @VisibleForTesting
    static void toLanguageTag(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocaleListCompatWrapper)) {
            return false;
        }
        Locale[] localeArr = ((LocaleListCompatWrapper) obj).mList;
        if (this.mList.length != localeArr.length) {
            return false;
        }
        int i8 = 0;
        while (true) {
            Locale[] localeArr2 = this.mList;
            if (i8 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i8].equals(localeArr[i8])) {
                return false;
            }
            i8++;
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale get(int i8) {
        if (i8 >= 0) {
            Locale[] localeArr = this.mList;
            if (i8 < localeArr.length) {
                return localeArr[i8];
            }
        }
        return null;
    }

    @Override // androidx.core.os.LocaleListInterface
    public Locale getFirstMatch(@NonNull String[] strArr) {
        return computeFirstMatch(Arrays.asList(strArr), false);
    }

    @Override // androidx.core.os.LocaleListInterface
    @Nullable
    public Object getLocaleList() {
        return null;
    }

    public int hashCode() {
        int i8 = 1;
        for (Locale locale : this.mList) {
            i8 = (i8 * 31) + locale.hashCode();
        }
        return i8;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(Locale locale) {
        int i8 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i8 < localeArr.length) {
                if (localeArr[i8].equals(locale)) {
                    return i8;
                }
                i8++;
            } else {
                return -1;
            }
        }
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
        if (this.mList.length == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
        return this.mList.length;
    }

    @Override // androidx.core.os.LocaleListInterface
    public String toLanguageTags() {
        return this.mStringRepresentation;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i8 = 0;
        while (true) {
            Locale[] localeArr = this.mList;
            if (i8 < localeArr.length) {
                sb.append(localeArr[i8]);
                if (i8 < this.mList.length - 1) {
                    sb.append(',');
                }
                i8++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
