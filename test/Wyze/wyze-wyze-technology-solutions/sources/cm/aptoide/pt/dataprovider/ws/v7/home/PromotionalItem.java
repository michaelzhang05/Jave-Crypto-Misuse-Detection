package cm.aptoide.pt.dataprovider.ws.v7.home;

import cm.aptoide.pt.bonus.BonusAppcModel;

/* loaded from: classes.dex */
public class PromotionalItem {
    private ActionItemResponse actionItemResponse;
    private BonusAppcModel bonusAppcModel;

    public PromotionalItem(ActionItemResponse actionItemResponse, BonusAppcModel bonusAppcModel) {
        this.actionItemResponse = actionItemResponse;
        this.bonusAppcModel = bonusAppcModel;
    }

    public ActionItemResponse getActionItemResponse() {
        return this.actionItemResponse;
    }

    public BonusAppcModel getBonusAppcModel() {
        return this.bonusAppcModel;
    }
}