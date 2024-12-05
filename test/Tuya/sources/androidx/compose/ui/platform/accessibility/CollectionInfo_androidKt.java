package androidx.compose.ui.platform.accessibility;

import M5.AbstractC1246t;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.CollectionItemInfo;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class CollectionInfo_androidKt {
    private static final boolean calculateIfHorizontallyStacked(List<SemanticsNode> list) {
        List m8;
        long m2745unboximpl;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() != 0 && list.size() != 1) {
            m8 = new ArrayList();
            SemanticsNode semanticsNode = list.get(0);
            int o8 = AbstractC1246t.o(list);
            int i8 = 0;
            while (i8 < o8) {
                i8++;
                SemanticsNode semanticsNode2 = list.get(i8);
                SemanticsNode semanticsNode3 = semanticsNode2;
                SemanticsNode semanticsNode4 = semanticsNode;
                m8.add(Offset.m2724boximpl(OffsetKt.Offset(Math.abs(Offset.m2735getXimpl(semanticsNode4.getBoundsInRoot().m2765getCenterF1C5BW0()) - Offset.m2735getXimpl(semanticsNode3.getBoundsInRoot().m2765getCenterF1C5BW0())), Math.abs(Offset.m2736getYimpl(semanticsNode4.getBoundsInRoot().m2765getCenterF1C5BW0()) - Offset.m2736getYimpl(semanticsNode3.getBoundsInRoot().m2765getCenterF1C5BW0())))));
                semanticsNode = semanticsNode2;
            }
        } else {
            m8 = AbstractC1246t.m();
        }
        if (m8.size() == 1) {
            m2745unboximpl = ((Offset) AbstractC1246t.m0(m8)).m2745unboximpl();
        } else if (!m8.isEmpty()) {
            Object m02 = AbstractC1246t.m0(m8);
            int o9 = AbstractC1246t.o(m8);
            if (1 <= o9) {
                int i9 = 1;
                while (true) {
                    m02 = Offset.m2724boximpl(Offset.m2740plusMKHz9U(((Offset) m02).m2745unboximpl(), ((Offset) m8.get(i9)).m2745unboximpl()));
                    if (i9 == o9) {
                        break;
                    }
                    i9++;
                }
            }
            m2745unboximpl = ((Offset) m02).m2745unboximpl();
        } else {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        if (Offset.m2726component2impl(m2745unboximpl) < Offset.m2725component1impl(m2745unboximpl)) {
            return true;
        }
        return false;
    }

    public static final boolean hasCollectionInfo(SemanticsNode semanticsNode) {
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo()) == null && SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) == null) {
            return false;
        }
        return true;
    }

    private static final boolean isLazyCollection(CollectionInfo collectionInfo) {
        if (collectionInfo.getRowCount() >= 0 && collectionInfo.getColumnCount() >= 0) {
            return false;
        }
        return true;
    }

    public static final void setCollectionInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int size;
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionInfo());
        if (collectionInfo != null) {
            accessibilityNodeInfoCompat.setCollectionInfo(toAccessibilityCollectionInfo(collectionInfo));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (SemanticsConfigurationKt.getOrNull(semanticsNode.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            List<SemanticsNode> replacedChildren$ui_release = semanticsNode.getReplacedChildren$ui_release();
            int size2 = replacedChildren$ui_release.size();
            for (int i8 = 0; i8 < size2; i8++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i8);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                }
            }
        }
        int i9 = 1;
        if (!arrayList.isEmpty()) {
            boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
            if (calculateIfHorizontallyStacked) {
                size = 1;
            } else {
                size = arrayList.size();
            }
            if (calculateIfHorizontallyStacked) {
                i9 = arrayList.size();
            }
            accessibilityNodeInfoCompat.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(size, i9, false, 0));
        }
    }

    public static final void setCollectionItemInfo(SemanticsNode semanticsNode, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        int i8;
        int i9;
        SemanticsConfiguration config = semanticsNode.getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        CollectionItemInfo collectionItemInfo = (CollectionItemInfo) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getCollectionItemInfo());
        if (collectionItemInfo != null) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(toAccessibilityCollectionItemInfo(collectionItemInfo, semanticsNode));
        }
        SemanticsNode parent = semanticsNode.getParent();
        if (parent != null && SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getSelectableGroup()) != null) {
            CollectionInfo collectionInfo = (CollectionInfo) SemanticsConfigurationKt.getOrNull(parent.getConfig(), semanticsProperties.getCollectionInfo());
            if ((collectionInfo != null && isLazyCollection(collectionInfo)) || !semanticsNode.getConfig().contains(semanticsProperties.getSelected())) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            List<SemanticsNode> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                SemanticsNode semanticsNode2 = replacedChildren$ui_release.get(i11);
                if (semanticsNode2.getConfig().contains(SemanticsProperties.INSTANCE.getSelected())) {
                    arrayList.add(semanticsNode2);
                    if (semanticsNode2.getLayoutNode$ui_release().getPlaceOrder$ui_release() < semanticsNode.getLayoutNode$ui_release().getPlaceOrder$ui_release()) {
                        i10++;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                boolean calculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
                if (calculateIfHorizontallyStacked) {
                    i8 = 0;
                } else {
                    i8 = i10;
                }
                if (calculateIfHorizontallyStacked) {
                    i9 = i10;
                } else {
                    i9 = 0;
                }
                AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain = AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i8, 1, i9, 1, false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.INSTANCE)).booleanValue());
                if (obtain != null) {
                    accessibilityNodeInfoCompat.setCollectionItemInfo(obtain);
                }
            }
        }
    }

    private static final AccessibilityNodeInfoCompat.CollectionInfoCompat toAccessibilityCollectionInfo(CollectionInfo collectionInfo) {
        return AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(collectionInfo.getRowCount(), collectionInfo.getColumnCount(), false, 0);
    }

    private static final AccessibilityNodeInfoCompat.CollectionItemInfoCompat toAccessibilityCollectionItemInfo(CollectionItemInfo collectionItemInfo, SemanticsNode semanticsNode) {
        return AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false, ((Boolean) semanticsNode.getConfig().getOrElse(SemanticsProperties.INSTANCE.getSelected(), CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1.INSTANCE)).booleanValue());
    }
}
