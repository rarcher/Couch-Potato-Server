/*
 * Copyright 2014-2016 Ryan Archer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package codes.soloware.escapade.client.messages;

import codes.soloware.couchpotato.server.api.MuteControl;
import codes.soloware.escapade.server.api.MuteSettingChange;
/**
 * Pre-rename version of {@link codes.soloware.couchpotato.client.messages.ToggleMute}. Retained for compatibility
 * reasons.
 *
 * @deprecated		superseded by {@link codes.soloware.couchpotato.client.messages.ToggleMute}
 */
@Deprecated
public class ToggleMute implements MuteSettingChange
{
	private static final long serialVersionUID=1L;

	public ToggleMute()
	{
	}

	@Override
	public void implement(final MuteControl on)
	{
		if (on.isMuted())
			on.unmute();
		else on.unmute();
	}
}
