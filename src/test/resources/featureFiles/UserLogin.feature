Feature: User Creation

  Background:
    Given The Environment is set as "testRegion47"
    And The application is launched in "Chrome"

  @smk @devSkip
  Scenario: User change password
    Given user login the platform
    When user changes the password
    Then password is updated successfully

  Scenario Outline:Verify <loginUsr> user has no access to create new user profile
    Given <loginUsr> user login to centric admin portal
    Then user has no access to create new users
    @smk
    Examples:
      | loginUsr |
      | FSR1     |
    Examples:
      | loginUsr   |
      | CAdminRO1  |
      | CSUpdates1 |
      | CSAuth1    |
      | CSProc1    |
      | CSNoAuth1  |
      | SDUpdates1 |
      | SDProc1    |
      | SDAuth1    |
      | AdvRO1     |
      | AdvAuth1   |
      | AdvNoAuth1 |
      | RT1        |
      | VOUser1    |
      | TDIssuer1  |

  Scenario Outline: Update an existing user details using <loginUsr> user
    Given <loginUsr> user login to centric admin portal
    When user updates the existing user details
    And <authUsr> user authorises the corresponding user related request
    Then user profile is updated
    @smk @devSkip
    Examples:
      | loginUsr      | authUsr       |
      | LAdminNoAuth1 | LAdminNoAuth2 |
    Examples:
      | loginUsr    | authUsr     |
      | CAdminRW1   | CAdminRW2   |
      | LAdminAuth1 | LAdminAuth2 |
      | LAdminNoCT1 | CAdminRW2   |

  Scenario Outline: Create <accessLevel> user using <loginUsr> user profile
    Given <loginUsr> user login to centric admin portal
    When user select add <targetUsr> in the corresponding page
    And finish through the user creation wizard
      | Entity             | Value            |
      | Access Level       | <accessLevel>    |
      | Company Name       | <companyName>    |
      | Banking Provider   | <bank>           |
      | xHubUser           | <xHub>           |
      | Wrap Provider      | <wrapProvider>   |
      | Company User       | <companyUser>    |
      | Company Access     | <companyAccess>  |
      | User Level         | <userLevel>      |
      | Account Permission | <acctPermission> |
    And <authUsr> user authorises the corresponding user related request
    Then new user successfully created
    @smk
    Examples:
      | loginUsr      | authUsr       | targetUsr    | accessLevel                         | companyName   | bank | xHub | wrapProvider | companyUser | companyAccess | userLevel | acctPermission |
      | LAdminAuth1   | LAdminAuth1   | Admin User   | Licensee Admin - Full Access - Auth | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | advisor user | Adviser - Read Only                 |               |      | No   |              | Yes         | Read Write    | Company   |                |
    @usrDataGen
    Examples:
      | loginUsr  | authUsr   | targetUsr    | accessLevel                              | companyName   | bank     | xHub | wrapProvider | companyUser | companyAccess | userLevel     | acctPermission |
      | CAdminRW1 | CAdminRW2 | advisor user | Adviser - Read Only                      | Findex Advice |          | No   |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | advisor user | Adviser - Full Access - Authorisation    | Findex Advice |          | No   |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | advisor user | Adviser - Full Access - No Authorisation | Findex Advice |          | No   |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Third Party  | Term Deposit Issuer                      |               | ANZ Bank |      |              |             |               |               |                |
      | CAdminRW1 | CAdminRW2 | Third Party  | View Only User                           |               |          |      |              |             |               | Client        | Yes            |
      | CAdminRW1 | CAdminRW2 | Admin User   | Financial Services Representative        | Findex Advice |          |      |              |             |               | Client        | Yes            |
      | CAdminRW1 | CAdminRW2 | Admin User   | Research Team                            | Findex Advice |          | No   |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Self-Directed Services - Authoriser      | Findex Advice |          | No   |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Self-Directed Services - Processor       | Findex Advice |          | No   |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Self-Directed Services - Client Updates  | Findex Advice |          | No   |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Client Services - Client Updates Only    | Findex Advice |          | No   |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Client Services - No Auth                | Findex Advice |          | Yes  |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Client Services - Authoriser - Auth      | Findex Advice |          | Yes  |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Client Services - Processor - Auth       | Findex Advice |          | Yes  |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Licensee Admin - No Client Transactions  | Findex Advice |          | Yes  |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Licensee Admin - Full Access - Auth      | Findex Advice |          | Yes  |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Licensee Admin - Full Access - No Auth   | Findex Advice |          | Yes  |              | Yes         | Read Write    | Company       |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Centric Admin - Read Write               |               |          | Yes  | Yes          | No          |               | Wrap Provider |                |
      | CAdminRW1 | CAdminRW2 | Admin User   | Centric Admin - Read Only                |               |          | Yes  | Yes          | No          |               | Wrap Provider |                |
    Examples:
      | loginUsr      | authUsr       | targetUsr    | accessLevel                              | companyName   | bank | xHub | wrapProvider | companyUser | companyAccess | userLevel | acctPermission |
      | LAdminAuth1   | LAdminAuth2   | advisor user | Adviser - Read Only                      |               |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminAuth1   | LAdminAuth2   | advisor user | Adviser - Full Access - Authorisation    | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminAuth1   | LAdminAuth2   | advisor user | Adviser - Full Access - No Authorisation | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminAuth1   | LAdminAuth2   | Admin User   | Client Services - Client Updates Only    | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminAuth1   | LAdminAuth2   | Admin User   | Client Services - No Auth                | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminAuth1   | LAdminAuth2   | Admin User   | Client Services - Authoriser - Auth      | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminAuth1   | LAdminAuth2   | Admin User   | Client Services - Processor - Auth       | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminAuth1   | LAdminAuth2   | Admin User   | Licensee Admin - Full Access - No Auth   | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminAuth1   | LAdminAuth2   | Admin User   | Licensee Admin - No Client Transactions  | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | advisor user | Adviser - Read Only                      |               |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | advisor user | Adviser - Full Access - Authorisation    | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | advisor user | Adviser - Full Access - No Authorisation | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | Admin User   | Client Services - Client Updates Only    | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | Admin User   | Client Services - No Auth                | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | Admin User   | Client Services - Authoriser - Auth      | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | Admin User   | Client Services - Processor - Auth       | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | Admin User   | Licensee Admin - Full Access - No Auth   | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | Admin User   | Licensee Admin - Full Access - Auth      | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoCT1   | CAdminRW2     | Admin User   | Licensee Admin - No Client Transactions  | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | advisor user | Adviser - Full Access - Authorisation    | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | advisor user | Adviser - Full Access - No Authorisation | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | Admin User   | Client Services - Client Updates Only    | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | Admin User   | Client Services - No Auth                | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | Admin User   | Client Services - Authoriser - Auth      | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | Admin User   | Client Services - Processor - Auth       | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | Admin User   | Licensee Admin - Full Access - No Auth   | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | Admin User   | Licensee Admin - Full Access - Auth      | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
      | LAdminNoAuth1 | LAdminNoAuth2 | Admin User   | Licensee Admin - No Client Transactions  | Findex Advice |      | No   |              | Yes         | Read Write    | Company   |                |
