package com.ci.ibus.events;

import lombok.Data;

/**
 * Created by fshamim on 21.05.15.
 */
@Data
public class ShowDialogEvent {

    public enum DlgType {
        Info, Success, Warning, Error, Default
    }

    public String title;
    public String message;
    public DlgType dlgType;
    public String positiveBtnText;
    public IClickHandler positiveBtnHandler;
    public String negativeBtnText;
    public IClickHandler negativeBtnHandler;
    public String neutralBtnText;
    public IClickHandler neutralBtnHandler;
    public boolean cancelable;

    private ShowDialogEvent() {
    }

    public static class Builder {
        private ShowDialogEvent event;

        public Builder() {
            event = new ShowDialogEvent();
        }

        public ShowDialogEvent build() {
            return event;
        }

        public Builder setMessage(String message) {
            event.message = message;
            return this;
        }

        public Builder setTitle(String title) {
            event.title = title;
            return this;
        }

        public Builder setDlgType(DlgType dlgType) {
            event.dlgType = dlgType;
            return this;
        }

        public Builder setPositiveButton(String positiveBtnText, IClickHandler iClickHandler) {
            event.positiveBtnText = positiveBtnText;
            event.positiveBtnHandler = iClickHandler;
            return this;
        }

        public Builder setNegativeButton(String negativeBtnText, IClickHandler iClickHandler) {
            event.negativeBtnText = negativeBtnText;
            event.negativeBtnHandler = iClickHandler;
            return this;
        }

        public Builder setNeutralButton(String neutralBtnText, IClickHandler iClickHandler) {
            event.neutralBtnText = neutralBtnText;
            event.neutralBtnHandler = iClickHandler;
            return this;
        }

        public Builder setCancelable(boolean cancelable) {
            event.cancelable = cancelable;
            return this;
        }
    }
}
