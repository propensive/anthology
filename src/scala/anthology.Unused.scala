/*
    Anthology, version [unreleased]. Copyright 2025 Jon Pretty, Propensive OÜ.

    The primary distribution site is: https://propensive.com/

    Licensed under the Apache License, Version 2.0 (the "License"); you may not use this
    file except in compliance with the License. You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software distributed under the
    License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
    either express or implied. See the License for the specific language governing permissions
    and limitations under the License.
*/

package anthology

import rudiments.*

enum Unused[VersionType]:
  case All extends Unused[3.1 | 3.2 | 3.3 | 3.4 | 3.5 | 3.6]
  case None extends Unused[3.1 | 3.2 | 3.3 | 3.4 | 3.5 | 3.6]

  case Subset[VersionType <: 3.3](features: List[UnusedFeature[VersionType]])
  extends Unused[VersionType]