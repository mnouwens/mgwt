/*
 * Copyright 2011 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.mgwt.ui.client.widget.tabbar;

import com.googlecode.mgwt.ui.client.MGWT;
import com.googlecode.mgwt.ui.client.MGWTStyle;
import com.googlecode.mgwt.ui.client.theme.base.TabBarCss;

/**
 * A simple search tab bar button.
 * 
 * @author Daniel Kurka
 * 
 */
public class SearchTabBarButton extends TabBarButton {
  /**
   * Construct a BookmarkTabBarButton
   */
	public SearchTabBarButton() {
		this(MGWTStyle.getTheme().getMGWTClientBundle().getTabBarCss());
	}

  /**
   * Construct a BookmarkTabBarButton with a given css
   * 
   * @param css the css to use
   */
	public SearchTabBarButton(TabBarCss css) {
    super(css, MGWT.getOsDetection().isIOs() || MGWT.getOsDetection().isDesktop() || MGWT.getOsDetection().isWindowsPhone() ? MGWTStyle.getTheme().getMGWTClientBundle().tabBarSearchImage() : null);
		setText("Search");
	}

}
