package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.AbstractC3247p;

@Stable
/* loaded from: classes.dex */
public final class ColorScheme {
    private final MutableState background$delegate;
    private final MutableState error$delegate;
    private final MutableState errorContainer$delegate;
    private final MutableState inverseOnSurface$delegate;
    private final MutableState inversePrimary$delegate;
    private final MutableState inverseSurface$delegate;
    private final MutableState onBackground$delegate;
    private final MutableState onError$delegate;
    private final MutableState onErrorContainer$delegate;
    private final MutableState onPrimary$delegate;
    private final MutableState onPrimaryContainer$delegate;
    private final MutableState onSecondary$delegate;
    private final MutableState onSecondaryContainer$delegate;
    private final MutableState onSurface$delegate;
    private final MutableState onSurfaceVariant$delegate;
    private final MutableState onTertiary$delegate;
    private final MutableState onTertiaryContainer$delegate;
    private final MutableState outline$delegate;
    private final MutableState outlineVariant$delegate;
    private final MutableState primary$delegate;
    private final MutableState primaryContainer$delegate;
    private final MutableState scrim$delegate;
    private final MutableState secondary$delegate;
    private final MutableState secondaryContainer$delegate;
    private final MutableState surface$delegate;
    private final MutableState surfaceTint$delegate;
    private final MutableState surfaceVariant$delegate;
    private final MutableState tertiary$delegate;
    private final MutableState tertiaryContainer$delegate;

    public /* synthetic */ ColorScheme(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, AbstractC3247p abstractC3247p) {
        this(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36);
    }

    /* renamed from: copy-G1PFc-w, reason: not valid java name */
    public final ColorScheme m1511copyG1PFcw(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return new ColorScheme(j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m1512getBackground0d7_KjU() {
        return ((Color) this.background$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m1513getError0d7_KjU() {
        return ((Color) this.error$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m1514getErrorContainer0d7_KjU() {
        return ((Color) this.errorContainer$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1515getInverseOnSurface0d7_KjU() {
        return ((Color) this.inverseOnSurface$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getInversePrimary-0d7_KjU, reason: not valid java name */
    public final long m1516getInversePrimary0d7_KjU() {
        return ((Color) this.inversePrimary$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getInverseSurface-0d7_KjU, reason: not valid java name */
    public final long m1517getInverseSurface0d7_KjU() {
        return ((Color) this.inverseSurface$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m1518getOnBackground0d7_KjU() {
        return ((Color) this.onBackground$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m1519getOnError0d7_KjU() {
        return ((Color) this.onError$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m1520getOnErrorContainer0d7_KjU() {
        return ((Color) this.onErrorContainer$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m1521getOnPrimary0d7_KjU() {
        return ((Color) this.onPrimary$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1522getOnPrimaryContainer0d7_KjU() {
        return ((Color) this.onPrimaryContainer$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m1523getOnSecondary0d7_KjU() {
        return ((Color) this.onSecondary$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1524getOnSecondaryContainer0d7_KjU() {
        return ((Color) this.onSecondaryContainer$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1525getOnSurface0d7_KjU() {
        return ((Color) this.onSurface$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m1526getOnSurfaceVariant0d7_KjU() {
        return ((Color) this.onSurfaceVariant$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnTertiary-0d7_KjU, reason: not valid java name */
    public final long m1527getOnTertiary0d7_KjU() {
        return ((Color) this.onTertiary$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1528getOnTertiaryContainer0d7_KjU() {
        return ((Color) this.onTertiaryContainer$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOutline-0d7_KjU, reason: not valid java name */
    public final long m1529getOutline0d7_KjU() {
        return ((Color) this.outline$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name */
    public final long m1530getOutlineVariant0d7_KjU() {
        return ((Color) this.outlineVariant$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m1531getPrimary0d7_KjU() {
        return ((Color) this.primary$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1532getPrimaryContainer0d7_KjU() {
        return ((Color) this.primaryContainer$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getScrim-0d7_KjU, reason: not valid java name */
    public final long m1533getScrim0d7_KjU() {
        return ((Color) this.scrim$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m1534getSecondary0d7_KjU() {
        return ((Color) this.secondary$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1535getSecondaryContainer0d7_KjU() {
        return ((Color) this.secondaryContainer$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m1536getSurface0d7_KjU() {
        return ((Color) this.surface$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name */
    public final long m1537getSurfaceTint0d7_KjU() {
        return ((Color) this.surfaceTint$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m1538getSurfaceVariant0d7_KjU() {
        return ((Color) this.surfaceVariant$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getTertiary-0d7_KjU, reason: not valid java name */
    public final long m1539getTertiary0d7_KjU() {
        return ((Color) this.tertiary$delegate.getValue()).m2986unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1540getTertiaryContainer0d7_KjU() {
        return ((Color) this.tertiaryContainer$delegate.getValue()).m2986unboximpl();
    }

    /* renamed from: setBackground-8_81llA$material3_release, reason: not valid java name */
    public final void m1541setBackground8_81llA$material3_release(long j8) {
        this.background$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setError-8_81llA$material3_release, reason: not valid java name */
    public final void m1542setError8_81llA$material3_release(long j8) {
        this.error$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setErrorContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1543setErrorContainer8_81llA$material3_release(long j8) {
        this.errorContainer$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setInverseOnSurface-8_81llA$material3_release, reason: not valid java name */
    public final void m1544setInverseOnSurface8_81llA$material3_release(long j8) {
        this.inverseOnSurface$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setInversePrimary-8_81llA$material3_release, reason: not valid java name */
    public final void m1545setInversePrimary8_81llA$material3_release(long j8) {
        this.inversePrimary$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setInverseSurface-8_81llA$material3_release, reason: not valid java name */
    public final void m1546setInverseSurface8_81llA$material3_release(long j8) {
        this.inverseSurface$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnBackground-8_81llA$material3_release, reason: not valid java name */
    public final void m1547setOnBackground8_81llA$material3_release(long j8) {
        this.onBackground$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnError-8_81llA$material3_release, reason: not valid java name */
    public final void m1548setOnError8_81llA$material3_release(long j8) {
        this.onError$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnErrorContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1549setOnErrorContainer8_81llA$material3_release(long j8) {
        this.onErrorContainer$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnPrimary-8_81llA$material3_release, reason: not valid java name */
    public final void m1550setOnPrimary8_81llA$material3_release(long j8) {
        this.onPrimary$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnPrimaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1551setOnPrimaryContainer8_81llA$material3_release(long j8) {
        this.onPrimaryContainer$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnSecondary-8_81llA$material3_release, reason: not valid java name */
    public final void m1552setOnSecondary8_81llA$material3_release(long j8) {
        this.onSecondary$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnSecondaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1553setOnSecondaryContainer8_81llA$material3_release(long j8) {
        this.onSecondaryContainer$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnSurface-8_81llA$material3_release, reason: not valid java name */
    public final void m1554setOnSurface8_81llA$material3_release(long j8) {
        this.onSurface$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnSurfaceVariant-8_81llA$material3_release, reason: not valid java name */
    public final void m1555setOnSurfaceVariant8_81llA$material3_release(long j8) {
        this.onSurfaceVariant$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnTertiary-8_81llA$material3_release, reason: not valid java name */
    public final void m1556setOnTertiary8_81llA$material3_release(long j8) {
        this.onTertiary$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOnTertiaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1557setOnTertiaryContainer8_81llA$material3_release(long j8) {
        this.onTertiaryContainer$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOutline-8_81llA$material3_release, reason: not valid java name */
    public final void m1558setOutline8_81llA$material3_release(long j8) {
        this.outline$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setOutlineVariant-8_81llA$material3_release, reason: not valid java name */
    public final void m1559setOutlineVariant8_81llA$material3_release(long j8) {
        this.outlineVariant$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setPrimary-8_81llA$material3_release, reason: not valid java name */
    public final void m1560setPrimary8_81llA$material3_release(long j8) {
        this.primary$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setPrimaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1561setPrimaryContainer8_81llA$material3_release(long j8) {
        this.primaryContainer$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setScrim-8_81llA$material3_release, reason: not valid java name */
    public final void m1562setScrim8_81llA$material3_release(long j8) {
        this.scrim$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setSecondary-8_81llA$material3_release, reason: not valid java name */
    public final void m1563setSecondary8_81llA$material3_release(long j8) {
        this.secondary$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setSecondaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1564setSecondaryContainer8_81llA$material3_release(long j8) {
        this.secondaryContainer$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setSurface-8_81llA$material3_release, reason: not valid java name */
    public final void m1565setSurface8_81llA$material3_release(long j8) {
        this.surface$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setSurfaceTint-8_81llA$material3_release, reason: not valid java name */
    public final void m1566setSurfaceTint8_81llA$material3_release(long j8) {
        this.surfaceTint$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setSurfaceVariant-8_81llA$material3_release, reason: not valid java name */
    public final void m1567setSurfaceVariant8_81llA$material3_release(long j8) {
        this.surfaceVariant$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setTertiary-8_81llA$material3_release, reason: not valid java name */
    public final void m1568setTertiary8_81llA$material3_release(long j8) {
        this.tertiary$delegate.setValue(Color.m2966boximpl(j8));
    }

    /* renamed from: setTertiaryContainer-8_81llA$material3_release, reason: not valid java name */
    public final void m1569setTertiaryContainer8_81llA$material3_release(long j8) {
        this.tertiaryContainer$delegate.setValue(Color.m2966boximpl(j8));
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.m2984toStringimpl(m1531getPrimary0d7_KjU())) + "onPrimary=" + ((Object) Color.m2984toStringimpl(m1521getOnPrimary0d7_KjU())) + "primaryContainer=" + ((Object) Color.m2984toStringimpl(m1532getPrimaryContainer0d7_KjU())) + "onPrimaryContainer=" + ((Object) Color.m2984toStringimpl(m1522getOnPrimaryContainer0d7_KjU())) + "inversePrimary=" + ((Object) Color.m2984toStringimpl(m1516getInversePrimary0d7_KjU())) + "secondary=" + ((Object) Color.m2984toStringimpl(m1534getSecondary0d7_KjU())) + "onSecondary=" + ((Object) Color.m2984toStringimpl(m1523getOnSecondary0d7_KjU())) + "secondaryContainer=" + ((Object) Color.m2984toStringimpl(m1535getSecondaryContainer0d7_KjU())) + "onSecondaryContainer=" + ((Object) Color.m2984toStringimpl(m1524getOnSecondaryContainer0d7_KjU())) + "tertiary=" + ((Object) Color.m2984toStringimpl(m1539getTertiary0d7_KjU())) + "onTertiary=" + ((Object) Color.m2984toStringimpl(m1527getOnTertiary0d7_KjU())) + "tertiaryContainer=" + ((Object) Color.m2984toStringimpl(m1540getTertiaryContainer0d7_KjU())) + "onTertiaryContainer=" + ((Object) Color.m2984toStringimpl(m1528getOnTertiaryContainer0d7_KjU())) + "background=" + ((Object) Color.m2984toStringimpl(m1512getBackground0d7_KjU())) + "onBackground=" + ((Object) Color.m2984toStringimpl(m1518getOnBackground0d7_KjU())) + "surface=" + ((Object) Color.m2984toStringimpl(m1536getSurface0d7_KjU())) + "onSurface=" + ((Object) Color.m2984toStringimpl(m1525getOnSurface0d7_KjU())) + "surfaceVariant=" + ((Object) Color.m2984toStringimpl(m1538getSurfaceVariant0d7_KjU())) + "onSurfaceVariant=" + ((Object) Color.m2984toStringimpl(m1526getOnSurfaceVariant0d7_KjU())) + "surfaceTint=" + ((Object) Color.m2984toStringimpl(m1537getSurfaceTint0d7_KjU())) + "inverseSurface=" + ((Object) Color.m2984toStringimpl(m1517getInverseSurface0d7_KjU())) + "inverseOnSurface=" + ((Object) Color.m2984toStringimpl(m1515getInverseOnSurface0d7_KjU())) + "error=" + ((Object) Color.m2984toStringimpl(m1513getError0d7_KjU())) + "onError=" + ((Object) Color.m2984toStringimpl(m1519getOnError0d7_KjU())) + "errorContainer=" + ((Object) Color.m2984toStringimpl(m1514getErrorContainer0d7_KjU())) + "onErrorContainer=" + ((Object) Color.m2984toStringimpl(m1520getOnErrorContainer0d7_KjU())) + "outline=" + ((Object) Color.m2984toStringimpl(m1529getOutline0d7_KjU())) + "outlineVariant=" + ((Object) Color.m2984toStringimpl(m1530getOutlineVariant0d7_KjU())) + "scrim=" + ((Object) Color.m2984toStringimpl(m1533getScrim0d7_KjU())) + ')';
    }

    private ColorScheme(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        this.primary$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j8), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j9), SnapshotStateKt.structuralEqualityPolicy());
        this.primaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j10), SnapshotStateKt.structuralEqualityPolicy());
        this.onPrimaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j11), SnapshotStateKt.structuralEqualityPolicy());
        this.inversePrimary$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j12), SnapshotStateKt.structuralEqualityPolicy());
        this.secondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j13), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondary$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j14), SnapshotStateKt.structuralEqualityPolicy());
        this.secondaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j15), SnapshotStateKt.structuralEqualityPolicy());
        this.onSecondaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j16), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiary$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j17), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiary$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j18), SnapshotStateKt.structuralEqualityPolicy());
        this.tertiaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j19), SnapshotStateKt.structuralEqualityPolicy());
        this.onTertiaryContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j20), SnapshotStateKt.structuralEqualityPolicy());
        this.background$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j21), SnapshotStateKt.structuralEqualityPolicy());
        this.onBackground$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j22), SnapshotStateKt.structuralEqualityPolicy());
        this.surface$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j23), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j24), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j25), SnapshotStateKt.structuralEqualityPolicy());
        this.onSurfaceVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j26), SnapshotStateKt.structuralEqualityPolicy());
        this.surfaceTint$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j27), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j28), SnapshotStateKt.structuralEqualityPolicy());
        this.inverseOnSurface$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j29), SnapshotStateKt.structuralEqualityPolicy());
        this.error$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j30), SnapshotStateKt.structuralEqualityPolicy());
        this.onError$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j31), SnapshotStateKt.structuralEqualityPolicy());
        this.errorContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j32), SnapshotStateKt.structuralEqualityPolicy());
        this.onErrorContainer$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j33), SnapshotStateKt.structuralEqualityPolicy());
        this.outline$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j34), SnapshotStateKt.structuralEqualityPolicy());
        this.outlineVariant$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j35), SnapshotStateKt.structuralEqualityPolicy());
        this.scrim$delegate = SnapshotStateKt.mutableStateOf(Color.m2966boximpl(j36), SnapshotStateKt.structuralEqualityPolicy());
    }
}
